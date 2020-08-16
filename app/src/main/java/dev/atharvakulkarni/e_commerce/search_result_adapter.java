package dev.atharvakulkarni.e_commerce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class search_result_adapter extends BaseAdapter
{
    Context context;
    ArrayList<PojoGrid> gridPojos;

    public search_result_adapter(Context context,ArrayList<PojoGrid> gridPojos)
    {
        this.context = context;
        this.gridPojos = gridPojos;
    }

    @Override
    public int getCount()
    {
        return gridPojos.size();
    }

    @Override
    public Object getItem(int i)
    {
        return null;
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup)
    {
        view = LayoutInflater.from(context).inflate(R.layout.search_result_list,viewGroup,false);

        TextView title = view.findViewById(R.id.title);
        ImageView image = view.findViewById(R.id.imageview);
        TextView price = view.findViewById(R.id.price);

        title.setText(gridPojos.get(i).getTitle());
        image.setImageResource(gridPojos.get(i).getImages());
        price.setText(gridPojos.get(i).getPrice());

        view.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(context, i+"", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context,show_product.class);
                context.startActivity(intent);
            }
        });

        return view;
    }
}

class PojoGrid
{
    private String title,price;
    private int images;

    public PojoGrid(String title, int images,String price)
    {
        this.title = title;
        this.images = images;
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }

    public int getImages()
    {
        return images;
    }

    public String getPrice()
    {
        return price;
    }
}