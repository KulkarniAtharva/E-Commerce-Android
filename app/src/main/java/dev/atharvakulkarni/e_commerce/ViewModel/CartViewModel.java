package dev.atharvakulkarni.e_commerce.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import dev.atharvakulkarni.e_commerce.model.CartApiResponse;
import dev.atharvakulkarni.e_commerce.repository.CartRepository;
import okhttp3.ResponseBody;

public class CartViewModel extends AndroidViewModel
{
    private CartRepository cartRepository;

    public CartViewModel(@NonNull Application application)
    {
        super(application);
        cartRepository = new CartRepository(application);
    }

    public LiveData<CartApiResponse> getProductsInCart(int userId)
    {
        return cartRepository.getProductsInCart(userId);
    }
}