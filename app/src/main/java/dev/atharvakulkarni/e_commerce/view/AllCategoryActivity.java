package dev.atharvakulkarni.e_commerce.view;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.util.ArrayList;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.adapter.AllCategoryAdapter;
import dev.atharvakulkarni.e_commerce.adapter.search_result_adapter;
import dev.atharvakulkarni.e_commerce.databinding.AllCategoriesBinding;
import dev.atharvakulkarni.e_commerce.model.AllCategory;
import dev.atharvakulkarni.e_commerce.model.SearchProduct;

public class AllCategoryActivity extends AppCompatActivity
{
    GridView gridView;
    ArrayList<AllCategory> list;
    AllCategoryAdapter adapterGrid;
    AllCategoriesBinding allCategoriesBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        allCategoriesBinding = DataBindingUtil.setContentView(this, R.layout.all_categories);

        gridView = allCategoriesBinding.gridlayout;

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));

        gridList();

        adapterGrid = new AllCategoryAdapter(this,list);
        gridView.setAdapter(adapterGrid);
    }

    private void gridList()
    {
        list = new ArrayList<AllCategory>();

        list.add(new AllCategory("Fashion",R.drawable.shoes1));
        list.add(new AllCategory("Mobiles",R.drawable.shoes2));
        list.add(new AllCategory("Electronics",R.drawable.shoes3));
        list.add(new AllCategory("Home",R.drawable.shoes3));
        list.add(new AllCategory("Appliances",R.drawable.shoes3));
        list.add(new AllCategory("Beauty",R.drawable.shoes3));
        list.add(new AllCategory("Toys & Baby",R.drawable.shoes3));
        list.add(new AllCategory("Sports & More",R.drawable.shoes3));
        list.add(new AllCategory("Furniture",R.drawable.shoes3));
        list.add(new AllCategory("Flights",R.drawable.shoes3));
        list.add(new AllCategory("Gift cards",R.drawable.shoes3));
    }
}