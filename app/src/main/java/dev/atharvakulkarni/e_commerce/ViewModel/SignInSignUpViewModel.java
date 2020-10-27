package dev.atharvakulkarni.e_commerce.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import dev.atharvakulkarni.e_commerce.model.CartApiResponse;
import dev.atharvakulkarni.e_commerce.repository.CartRepository;
import dev.atharvakulkarni.e_commerce.repository.SignInSignUpRepository;

public class SignInSignUpViewModel extends AndroidViewModel
{
    private SignInSignUpRepository signInSignUpRepository;

    public SignInSignUpViewModel(@NonNull Application application)
    {
        super(application);
        signInSignUpRepository = new SignInSignUpRepository(application);
    }

   /* public LiveData<CartApiResponse> getProductsInCart(int userId)
    {
        return signInSignUpRepository.getProductsInCart(userId);
    }*/
}
