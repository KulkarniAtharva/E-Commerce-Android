package dev.atharvakulkarni.e_commerce.ui.main.repositories;

import java.util.ArrayList;

import dev.atharvakulkarni.e_commerce.ui.main.models.HomeModel;

public class HomeRepository
{
    private static HomeRepository instance;
    private ArrayList<HomeModel> dataSet = new ArrayList<>();

    public static HomeRepository getInstance()
    {
        if(instance == null)
        {
            instance = new HomeRepository();
        }
        return instance;
    }
}
