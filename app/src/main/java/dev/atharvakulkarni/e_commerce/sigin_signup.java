package dev.atharvakulkarni.e_commerce;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sigin_signup extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_signup);

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));


    }
}
