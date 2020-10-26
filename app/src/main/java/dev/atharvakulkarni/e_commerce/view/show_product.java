package dev.atharvakulkarni.e_commerce.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import dev.atharvakulkarni.e_commerce.R;

public class show_product extends AppCompatActivity
{
    Button buy_now;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_product);

        buy_now = findViewById(R.id.buy_now);

        buy_now.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(show_product.this, order_placing.class);
                startActivity(intent);
            }
        });
    }
}
