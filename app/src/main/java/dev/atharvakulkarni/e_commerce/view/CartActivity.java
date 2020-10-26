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

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.ViewModel.CartViewModel;
import dev.atharvakulkarni.e_commerce.adapter.CartAdapter;
import dev.atharvakulkarni.e_commerce.databinding.CartBinding;

public class CartActivity extends AppCompatActivity
{
    CartBinding cartBinding;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Button continue_button;
    CartViewModel cartViewModel;
    CartAdapter myAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        cartBinding = DataBindingUtil.setContentView(this, R.layout.cart);

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));

        recyclerView = cartBinding.recyclerview;
        continue_button = cartBinding.continueButton;

        myAdapter = new CartAdapter(recyclerView,CartActivity.this,new ArrayList<Integer>(),new ArrayList<String>(),new ArrayList<String>());
        recyclerView.setAdapter(myAdapter);

        //((myAdapter) recyclerView.getAdapter()).update(R.drawable.shoes1,"Asian WNDR-13 Running Shoes for Men(Green, Grey)","₹300.00");
      //  ((myAdapter) recyclerView.getAdapter()).update(R.drawable.shoes2,"Asian WNDR-13 Running Shoes for Men(Green, Grey)","₹500.00");

        linearLayoutManager = new LinearLayoutManager(CartActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        cartViewModel = new ViewModelProvider(this).get(CartViewModel.class);

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
}