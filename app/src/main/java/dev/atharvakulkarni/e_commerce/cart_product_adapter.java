package dev.atharvakulkarni.e_commerce;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class cart_product_adapter extends RecyclerView.Adapter<cart_product_adapter.ViewHolder>
{
    Context context;
    RecyclerView recyclerView;
    ArrayList<Integer> image;
    ArrayList<String> title;
    ArrayList<String> price;

    public cart_product_adapter(RecyclerView recyclerView, Context context, ArrayList<Integer> image,ArrayList<String> title,ArrayList<String> price)
    {
        this.recyclerView = recyclerView;
        this.context = context;
        this.image = image;
        this.title = title;
        this.price = price;
    }

    public void update(Integer images,String titles,String prices)
    {
       // Toast.makeText(context, titles, Toast.LENGTH_SHORT).show();
        image.add(images);
        title.add(titles);
        price.add(prices);

        notifyDataSetChanged();  // refreshes the recycler view automatically
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.cart_eachproduct,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.title.setText(title.get(position));
        holder.price.setText(price.get(position));
       // holder.image.setImageResource(R.drawable.shoes1);

        Glide.with(context)
                .load(image.get(position))
                .into(holder.image);

        //Toast.makeText(context, title.get(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount()
    {
        return title.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView title,price;
        ImageView image;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
            image = itemView.findViewById(R.id.imageview);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    int position = recyclerView.getChildLayoutPosition(view);

                    Toast.makeText(context, position+"", Toast.LENGTH_SHORT).show();

                   // Intent intent = new Intent(context,address.class);
                    //    context.startActivity(intent);
                }
            });


        }
    }
}
