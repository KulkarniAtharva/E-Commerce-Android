package dev.atharvakulkarni.e_commerce.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.ViewModel.AddFavoriteViewModel;
import dev.atharvakulkarni.e_commerce.ViewModel.CartViewModel;
import dev.atharvakulkarni.e_commerce.ViewModel.FromCartViewModel;
import dev.atharvakulkarni.e_commerce.ViewModel.RemoveFavoriteViewModel;
import dev.atharvakulkarni.e_commerce.databinding.CartItemBinding;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>
{
    Context context;
    RecyclerView recyclerView;
    ArrayList<Integer> image;
    ArrayList<String> title;
    ArrayList<String> price;

    private AddFavoriteViewModel addFavoriteViewModel;
    private RemoveFavoriteViewModel removeFavoriteViewModel;
    private FromCartViewModel fromCartViewModel;

    public CartAdapter(RecyclerView recyclerView, Context context, ArrayList<Integer> image, ArrayList<String> title, ArrayList<String> price)
    {
        this.recyclerView = recyclerView;
        this.context = context;
        this.image = image;
        this.title = title;
        this.price = price;

        addFavoriteViewModel = new ViewModelProvider(context).get(AddFavoriteViewModel.class);
        removeFavoriteViewModel = new ViewModelProvider(context).get(RemoveFavoriteViewModel.class);
        fromCartViewModel = new ViewModelProvider(context).get(FromCartViewModel.class);
    }

   /* public void update(Integer images,String titles,String prices)
    {
       // Toast.makeText(context, titles, Toast.LENGTH_SHORT).show();
        image.add(images);
        title.add(titles);
        price.add(prices);

        notifyDataSetChanged();  // refreshes the recycler view automatically
    }*/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        //View view = LayoutInflater.from(context).inflate(R.layout.cart_item,parent,false);
        //return new ViewHolder(view);

        CartItemBinding cartListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.cart_item, parent, false);
        return new ViewHolder(cartListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.binding.title.setText(title.get(position));
        holder.binding.price.setText(price.get(position));
        holder.binding.image.setImageResource(image.get(position));

       // Glide.with(context).load(image.get(position)).into(holder.image);

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
        private final CartItemBinding binding;

        public ViewHolder(CartItemBinding binding)
        {
            super(binding.getRoot());
            View itemView = binding.getRoot();

            this.binding = binding;

            title = binding.title;
            price = binding.price;
            image = binding.image;

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