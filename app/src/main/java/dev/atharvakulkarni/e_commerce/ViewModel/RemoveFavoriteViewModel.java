package dev.atharvakulkarni.e_commerce.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import dev.atharvakulkarni.e_commerce.repository.RemoveFavoriteRepository;
import dev.atharvakulkarni.e_commerce.utils.RequestCallback;
import okhttp3.ResponseBody;

public class RemoveFavoriteViewModel extends AndroidViewModel
{
    private RemoveFavoriteRepository removeFavoriteRepository;

    public RemoveFavoriteViewModel(@NonNull Application application)
    {
        super(application);
        removeFavoriteRepository = new RemoveFavoriteRepository(application);
    }

    public LiveData<ResponseBody> removeFavorite(int userId, int productId, RequestCallback callback)
    {
        return removeFavoriteRepository.removeFavorite(userId, productId, callback);
    }
}