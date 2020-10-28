package dev.atharvakulkarni.e_commerce.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

import dev.atharvakulkarni.e_commerce.R;
import dev.atharvakulkarni.e_commerce.model.AllCategory;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Fragment fragment = null;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*LinearLayout lin_lay_add_paynow = (LinearLayout)findViewById(R.id.home_linear_layout);

        View pay_now_view = getLayoutInflater().inflate(R.layout.home, null);
        lin_lay_add_paynow.addView(pay_now_view);
        Button button =  pay_now_view.findViewById(R.id.hamburger);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });*/


        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

      /*  View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions =  View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);*/

        Drawable background = getResources().getDrawable(R.drawable.gradient_home,getTheme());
       // getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent,getTheme()));
        getWindow().setBackgroundDrawable(background);



        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch(item.getItemId())
                {
                    case R.id.home:

                                        fragment = new Home();
                                        switchfragment(fragment);

                                    break;
                    case R.id.cart:

                                    break;
                    case R.id.shopping_bag:

                                    break;

                    case R.id.message:

                        break;

                    case R.id.user:

                                        fragment = new User();
                                        switchfragment(fragment);

                                    break;

                }


                return false;
            }
        });

        if (savedInstanceState == null)
        {
            bottomNavigationView.setSelectedItemId(R.id.home); // change to whichever id should be default
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.all_categories:  all_category();   break;
            case R.id.orders:   my_orders();  break;
            case R.id.cart:   cart(); break;
            case R.id.wishlist:     break;
            case R.id.account:     break;
            case R.id.notifications:    break;
            case R.id.privacy_policy:    break;
            case R.id.legal: break;
            case R.id.report: break;
            case R.id.rate: break;
            case R.id.share: break;
            case R.id.logout: break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    void cart()
    {
        Intent intent = new Intent(this,CartActivity.class);
        startActivity(intent);
    }

    void all_category()
    {
        Intent intent = new Intent(this, AllCategoryActivity.class);
        startActivity(intent);
    }

    void my_orders()
    {
        Intent intent = new Intent(this, MyOrdersActivity.class);
        startActivity(intent);
    }

    void switchfragment(Fragment fragment)
    {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.framelayout,fragment).commit();
    }
}