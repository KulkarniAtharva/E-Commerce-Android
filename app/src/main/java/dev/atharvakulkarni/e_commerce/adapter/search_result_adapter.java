package dev.atharvakulkarni.e_commerce.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.ViewModel.AddFavoriteViewModel;
import dev.atharvakulkarni.e_commerce.ViewModel.FromCartViewModel;
import dev.atharvakulkarni.e_commerce.ViewModel.RemoveFavoriteViewModel;
import dev.atharvakulkarni.e_commerce.databinding.CartItemBinding;
import dev.atharvakulkarni.e_commerce.databinding.SearchResultListBinding;
import dev.atharvakulkarni.e_commerce.model.Product;
import dev.atharvakulkarni.e_commerce.model.SearchProduct;
import dev.atharvakulkarni.e_commerce.view.show_product;

public class search_result_adapter extends RecyclerView.Adapter<search_result_adapter.ViewHolder>
{
    Context context;
    RecyclerView recyclerView;
    ArrayList<Integer> image;
    ArrayList<String> title;
    ArrayList<String> price;

    private List<Product> productsInCart;

    private CartAdapter.CartAdapterOnClickHandler clickHandler;


    /**
     * The interface that receives onClick messages.
     */
    public interface CartAdapterOnClickHandler
    {
        void onClick(Product product);
    }

    public search_result_adapter(RecyclerView recyclerView, Context context, ArrayList<Integer> image, ArrayList<String> title, ArrayList<String> price)
    {
        this.recyclerView = recyclerView;
        this.context = context;
        this.image = image;
        this.title = title;
        this.price = price;

        Toast.makeText(context, "fdfds", Toast.LENGTH_SHORT).show();

      /*  addFavoriteViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(AddFavoriteViewModel.class);
        removeFavoriteViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(RemoveFavoriteViewModel.class);
        fromCartViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(FromCartViewModel.class);*/
    }

    /*public CartAdapter(Context mContext, List<Product> productInCart, CartAdapter.CartAdapterOnClickHandler clickHandler, FragmentActivity activity)
    {
        this.context = context;
        this.productsInCart = productInCart;
        this.clickHandler = clickHandler;
        addFavoriteViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(AddFavoriteViewModel.class);
        removeFavoriteViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(RemoveFavoriteViewModel.class);
        fromCartViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(FromCartViewModel.class);
    }*/

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
        //View view = LayoutInflater.from(context).inflate(R.layout.cart_item,parent,false);
        //return new ViewHolder(view);

        SearchResultListBinding searchResultListBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.search_result_list, parent, false);
        return new ViewHolder(searchResultListBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.searchResultListBinding.title.setText(title.get(position));
        holder.searchResultListBinding.price.setText(price.get(position));
        holder.searchResultListBinding.imageview.setImageResource(image.get(position));

        // Glide.with(context).load(image.get(position)).into(holder.image);

        Toast.makeText(context, title.get(position), Toast.LENGTH_SHORT).show();
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
        private final SearchResultListBinding searchResultListBinding;

        public ViewHolder(SearchResultListBinding searchResultListBinding)
        {
            super(searchResultListBinding.getRoot());
            View itemView = searchResultListBinding.getRoot();

            this.searchResultListBinding = searchResultListBinding;

            title = searchResultListBinding.title;
            price = searchResultListBinding.price;
            image = searchResultListBinding.imageview;

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