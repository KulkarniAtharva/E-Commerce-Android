package dev.atharvakulkarni.e_commerce.ui.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import dev.atharvakulkarni.e_commerce.ui.main.models.HomeModel;
import dev.atharvakulkarni.e_commerce.ui.main.view.User;

public class HomeViewModel extends ViewModel
{
    private MutableLiveData<List<HomeModel>> users;
    public LiveData<List<HomeModel>> getUsers()
    {
        if (users == null)
        {
            users = new MutableLiveData<List<HomeModel>>();
            loadUsers();
        }
        return users;
    }

    private void loadUsers()
    {
        // Do an asynchronous operation to fetch users.
    }
}
