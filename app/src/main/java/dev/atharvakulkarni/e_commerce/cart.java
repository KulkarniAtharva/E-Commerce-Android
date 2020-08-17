package dev.atharvakulkarni.e_commerce;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cart extends AppCompatActivity
{
    SeekBar seekBar;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));

        seekBar = (SeekBar)findViewById(R.id.seekbar);
        recyclerView = findViewById(R.id.recyclerview);

        seekBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.green2,getTheme()), PorterDuff.Mode.SRC_ATOP);
        seekBar.getThumb().setColorFilter(getResources().getColor(R.color.green2,getTheme()), PorterDuff.Mode.SRC_ATOP);

        cart_product_adapter myAdapter = new cart_product_adapter(recyclerView,cart.this,new ArrayList<Integer>(),new ArrayList<String>(),new ArrayList<String>());
        recyclerView.setAdapter(myAdapter);

        linearLayoutManager = new LinearLayoutManager(cart.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ((cart_product_adapter) recyclerView.getAdapter()).update(R.drawable.shoes1,"Asian WNDR-13 Running Shoes for Men(Green, Grey)","₹300.00");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            int stepSize = 3;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b)
            {
               // progress = ((int)Math.round(progress/stepSize))*stepSize;
                seekBar.setProgress(progress);

                Toast.makeText(cart.this, progress+"", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
    }
}
