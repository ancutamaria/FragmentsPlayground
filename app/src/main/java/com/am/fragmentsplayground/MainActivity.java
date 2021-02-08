package com.am.fragmentsplayground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(view -> {
            SecondFragment secondFragment = new SecondFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.bottomLayout, secondFragment, secondFragment.getTag())
                    .commit();
        });

        button2.setOnClickListener(view -> {
            ThirdFragment thirdFragment = new ThirdFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.bottomLayout, thirdFragment, thirdFragment.getTag())
                    .commit();
        });

        FirstFragment firstFragment = new FirstFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.topLayout, firstFragment, firstFragment.getTag())
                .commit();

        SecondFragment secondFragment = new SecondFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.bottomLayout, secondFragment, secondFragment.getTag())
                .commit();
    }

    public String getCustomText(){
        return "trilu";
    }
}