package dev.atharvakulkarni.e_commerce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class sigin_signup extends AppCompatActivity
{
    ConstraintLayout signin_page,signup_page;
    Button continue_btn;
    TextView signin,signup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_signup);

        signin_page = findViewById(R.id.signin_page);
        signup_page = findViewById(R.id.signup_page);
        continue_btn = findViewById(R.id.continue_button);
        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));

        continue_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(sigin_signup.this,MainActivity.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                signup_page.setVisibility(View.GONE);
                signin_page.setVisibility(View.VISIBLE);
            }
        });

        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                signin_page.setVisibility(View.GONE);
                signup_page.setVisibility(View.VISIBLE);
            }
        });
    }
}