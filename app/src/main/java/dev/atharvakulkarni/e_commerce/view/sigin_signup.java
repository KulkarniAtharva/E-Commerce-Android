package dev.atharvakulkarni.e_commerce.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.ViewModel.CartViewModel;
import dev.atharvakulkarni.e_commerce.ViewModel.SignInSignUpViewModel;
import dev.atharvakulkarni.e_commerce.databinding.SigninSignupBinding;

public class sigin_signup extends AppCompatActivity
{
    ConstraintLayout signin_page,signup_page;
    Button continue_btn, signup_button;
    TextView signin,signup;
    SigninSignupBinding signinSignupBinding;
    SignInSignUpViewModel signInSignUpViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_signup);
        signinSignupBinding = DataBindingUtil.setContentView(this, R.layout.signin_signup);

        signin_page = signinSignupBinding.signinPage;
        signup_page = signinSignupBinding.signupPage;
        continue_btn = signinSignupBinding.continueButton;
        signup_button = signinSignupBinding.signupButton;
        signin = signinSignupBinding.signin;
        signup = signinSignupBinding.signup;

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));

        signInSignUpViewModel = new ViewModelProvider(this).get(SignInSignUpViewModel.class);

        continue_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(sigin_signup.this, MainActivity.class);
                startActivity(intent);
            }
        });

        signup_button.setOnClickListener(new View.OnClickListener()
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