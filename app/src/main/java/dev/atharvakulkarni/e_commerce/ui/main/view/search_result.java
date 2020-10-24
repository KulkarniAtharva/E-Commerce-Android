package dev.atharvakulkarni.e_commerce.ui.main.view;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.ui.main.adapter.PojoGrid;
import dev.atharvakulkarni.e_commerce.ui.main.adapter.search_result_adapter;

public class search_result extends AppCompatActivity
{
    GridView gridView;
    ArrayList<PojoGrid> list;
    search_result_adapter adapterGrid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);

        gridView = findViewById(R.id.gridlayout);

        gridList();

        adapterGrid = new search_result_adapter(this,list);
        gridView.setAdapter(adapterGrid);
    }

    private void gridList()
    {
        list = new ArrayList<PojoGrid>();

        list.add(new PojoGrid("Cheries",R.drawable.shoes1,"₹300"));
        list.add(new PojoGrid("Cheries",R.drawable.shoes2,"₹400"));
        list.add(new PojoGrid("Cheries",R.drawable.shoes3,"₹500"));
        list.add(new PojoGrid("Cheries",R.drawable.shoes3,"₹600"));
    }
}