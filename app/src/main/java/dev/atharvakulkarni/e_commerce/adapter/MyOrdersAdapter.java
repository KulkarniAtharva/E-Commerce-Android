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
import dev.atharvakulkarni.e_commerce.databinding.MyOrdersBinding;
import dev.atharvakulkarni.e_commerce.databinding.MyOrdersItemBinding;
import dev.atharvakulkarni.e_commerce.databinding.SearchResultListBinding;
import dev.atharvakulkarni.e_commerce.model.Product;
import dev.atharvakulkarni.e_commerce.model.SearchProduct;
import dev.atharvakulkarni.e_commerce.view.OrderDetailsActivity;
import dev.atharvakulkarni.e_commerce.view.show_product;

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrdersAdapter.ViewHolder>
{
    Context context;
    RecyclerView recyclerView;
    ArrayList<Integer> image;
    ArrayList<String> title;
    ArrayList<String> order_status;

    private List<Product> productsInCart;

    private CartAdapter.CartAdapterOnClickHandler clickHandler;


    /**
     * The interface that receives onClick messages.
     */
    public interface CartAdapterOnClickHandler
    {
        void onClick(Product product);
    }

    public MyOrdersAdapter(RecyclerView recyclerView, Context context, ArrayList<Integer> image, ArrayList<String>order_status,ArrayList<String> title)
    {
        this.recyclerView = recyclerView;
        this.context = context;
        this.image = image;
        this.title = title;
        this.order_status = order_status;
    }

    public void update(Integer images,String order_status,String titles)
    {
        image.add(images);
        title.add(titles);
        this.order_status.add(order_status);

        notifyDataSetChanged();  // refreshes the recycler view automatically
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        //View view = LayoutInflater.from(context).inflate(R.layout.cart_item,parent,false);
        //return new ViewHolder(view);

        MyOrdersItemBinding myOrdersItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.my_orders_item, parent, false);
        return new ViewHolder(myOrdersItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.myOrdersItemBinding.title.setText(title.get(position));
        holder.myOrdersItemBinding.orderStatus.setText(order_status.get(position));
        holder.myOrdersItemBinding.imageview.setImageResource(image.get(position));
    }

    @Override
    public int getItemCount()
    {
        return title.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView title,order_status;
        ImageView image;
        private final MyOrdersItemBinding myOrdersItemBinding;

        public ViewHolder(MyOrdersItemBinding myOrdersItemBinding)
        {
            super(myOrdersItemBinding.getRoot());
            View itemView = myOrdersItemBinding.getRoot();

            this.myOrdersItemBinding = myOrdersItemBinding;

            title = myOrdersItemBinding.title;
            order_status = myOrdersItemBinding.orderStatus;
            image = myOrdersItemBinding.imageview;

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    int position = recyclerView.getChildLayoutPosition(view);

                    Toast.makeText(context, position+"", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context, OrderDetailsActivity.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}