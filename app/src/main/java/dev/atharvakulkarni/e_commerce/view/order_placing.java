package dev.atharvakulkarni.e_commerce.view;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.databinding.OrderPlacingBinding;

public class order_placing extends AppCompatActivity
{
    OrderPlacingBinding binding;
    SeekBar seekBar;
    Button deliver_here,continue_button;
    LinearLayout address,order_summary,linearLayout2;
    ConstraintLayout payment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.order_placing);

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getTheme()));


        seekBar = binding.seekbar;
        deliver_here = binding.deliverHere;
        continue_button = binding.continueButton;
        address  = binding.address;
        order_summary = binding.orderSummary;
        linearLayout2 = binding.linearlayout2;
        payment = binding.payment;

        seekBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.green2,getTheme()), PorterDuff.Mode.SRC_ATOP);
        seekBar.getThumb().setColorFilter(getResources().getColor(R.color.green2,getTheme()), PorterDuff.Mode.SRC_ATOP);

        seekBar.setProgress(10);

        deliver_here.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                address.setVisibility(View.GONE);
                order_summary.setVisibility(View.VISIBLE);

                seekBar.setProgress(48);
            }
        });

        continue_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                order_summary.setVisibility(View.GONE);
                payment.setVisibility(View.VISIBLE);
                linearLayout2.setVisibility(View.VISIBLE);

                seekBar.setProgress(88);
            }
        });

        seekBar.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });

        /*
        order_placing.sliderListener sldListener = new order_placing.sliderListener();
        seekBar.setOnSeekBarChangeListener(sldListener);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            int stepSize = 3;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b)
            {
                // progress = ((int)Math.round(progress/stepSize))*stepSize;
                seekBar.setProgress(progress);

                Toast.makeText(order_placing.this, progress+"", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });*/
    }

    /*private class sliderListener implements SeekBar.OnSeekBarChangeListener
    {
        private int smoothnessFactor = 10;
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
        {
            progress = Math.round(progress / smoothnessFactor);
            TextView lblProgress = (TextView) findViewById(R.id.seekbar);
            lblProgress.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar)
        {
        }

        public void onStopTrackingTouch(SeekBar seekBar)
        {
            seekBar.setProgress(Math.round((seekBar.getProgress() + (smoothnessFactor / 2)) / smoothnessFactor) * smoothnessFactor);
        }
    }*/
}