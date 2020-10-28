package dev.atharvakulkarni.e_commerce.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.adapter.MyOrdersAdapter;
import dev.atharvakulkarni.e_commerce.adapter.search_result_adapter;
import dev.atharvakulkarni.e_commerce.databinding.MyOrdersBinding;
import dev.atharvakulkarni.e_commerce.databinding.SearchResultBinding;

public class MyOrdersActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    MyOrdersAdapter myOrdersAdapter;
    MyOrdersBinding myOrdersBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        myOrdersBinding = DataBindingUtil.setContentView(this, R.layout.my_orders);

        recyclerView = myOrdersBinding.recyclerview;

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));

        setUpRecyclerView();
        getProductsInCart();
    }

    private void setUpRecyclerView()
    {
        linearLayoutManager = new LinearLayoutManager(MyOrdersActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        // cartBinding.recyclerview.setHasFixedSize(true);
        //  cartViewModel = new ViewModelProvider(this).get(CartViewModel.class);
    }

    private void getProductsInCart()
    {
        myOrdersAdapter = new MyOrdersAdapter(recyclerView,MyOrdersActivity.this,new ArrayList<Integer>(),new ArrayList<String>(),new ArrayList<String>());


        myOrdersAdapter.update(R.drawable.shoes1,"Refund Accepted","Asian WNDR-13 Running Shoes for Men(Green, Grey)");
        myOrdersAdapter.update(R.drawable.shoes2,"Delivered on Oct 30,2019","Asian WNDR-13 Running Shoes for Men(Green, Grey)");

        recyclerView.setAdapter(myOrdersAdapter);
        myOrdersAdapter.notifyDataSetChanged();
    }
}
