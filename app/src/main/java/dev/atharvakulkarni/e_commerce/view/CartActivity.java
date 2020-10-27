package dev.atharvakulkarni.e_commerce.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.ViewModel.CartViewModel;
import dev.atharvakulkarni.e_commerce.adapter.CartAdapter;
import dev.atharvakulkarni.e_commerce.databinding.CartBinding;
import dev.atharvakulkarni.e_commerce.model.Product;
import dev.atharvakulkarni.e_commerce.storage.LoginUtils;

import static android.os.Build.PRODUCT;

public class CartActivity extends AppCompatActivity
{
    CartBinding cartBinding;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Button continue_button;
    CartViewModel cartViewModel;
    CartAdapter cartAdapter;

    private List<Product> favoriteList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        cartBinding = DataBindingUtil.setContentView(this, R.layout.cart);

        getWindow().setStatusBarColor(getResources().getColor(R.color.white, getTheme()));

        recyclerView = cartBinding.recyclerview;
        continue_button = cartBinding.continueButton;

        setUpRecyclerView();
        getProductsInCart();

        continue_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(CartActivity.this, order_placing.class);
                startActivity(intent);
            }
        });
    }

    private void setUpRecyclerView()
    {
        linearLayoutManager = new LinearLayoutManager(CartActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
       // cartBinding.recyclerview.setHasFixedSize(true);
        cartViewModel = new ViewModelProvider(this).get(CartViewModel.class);
    }

    private void getProductsInCart()
    {
        cartAdapter = new CartAdapter(recyclerView,CartActivity.this,new ArrayList<Integer>(),new ArrayList<String>(),new ArrayList<String>());


        cartAdapter.update(R.drawable.shoes1,"Asian WNDR-13 Running Shoes for Men(Green, Grey)","₹300.00");
        cartAdapter.update(R.drawable.shoes2,"Asian WNDR-13 Running Shoes for Men(Green, Grey)","₹500.00");

        cartBinding.recyclerview.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();


       /* cartViewModel.getProductsInCart(LoginUtils.getInstance(this).getUserInfo().getId()).observe(this, cartApiResponse ->
        {
            if (cartApiResponse != null)
            {
                favoriteList = cartApiResponse.getProductsInCart();
                if (favoriteList.size() == 0)
                {
                    //cartBinding.noBookmarks.setVisibility(View.VISIBLE);
                   // cartBinding.emptyCart.setVisibility(View.VISIBLE);
                }
                else
                    cartBinding.recyclerview.setVisibility(View.VISIBLE);

                /*cartAdapter = new CartAdapter(getApplicationContext(), favoriteList, product ->
                {
                    Intent intent = new Intent(CartActivity.this, order_placing.class);
                    // Pass an object of product class
                    intent.putExtra(PRODUCT, (product));
                    startActivity(intent);
                }, this);*/


            }

           // binding.loadingIndicator.setVisibility(View.GONE);

        //});*/

}