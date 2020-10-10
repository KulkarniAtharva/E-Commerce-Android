package dev.atharvakulkarni.e_commerce;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
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

        ((cart_product_adapter) recyclerView.getAdapter()).update(R.drawable.shoes1,"Asian WNDR-13 Running Shoes for Men(Green, Grey)","₹300.00");
        ((cart_product_adapter) recyclerView.getAdapter()).update(R.drawable.shoes2,"Asian WNDR-13 Running Shoes for Men(Green, Grey)","₹500.00");




        linearLayoutManager = new LinearLayoutManager(cart.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        seekBar.setProgress(10);


        sliderListener sldListener = new sliderListener();
        seekBar.setOnSeekBarChangeListener(sldListener);


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

    private class sliderListener implements SeekBar.OnSeekBarChangeListener {
        private int smoothnessFactor = 10;
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            progress = Math.round(progress / smoothnessFactor);
            TextView lblProgress = (TextView) findViewById(R.id.seekbar);
            lblProgress.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.setProgress(Math.round((seekBar.getProgress() + (smoothnessFactor / 2)) / smoothnessFactor) * smoothnessFactor);
        }
    }
}
