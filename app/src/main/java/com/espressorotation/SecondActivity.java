package com.espressorotation;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String FRAGMENT_TAG = "fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag(FRAGMENT_TAG) == null) {
            SimpleFragment fragment = new SimpleFragment();
            supportFragmentManager.beginTransaction().add(R.id.about_container,
                    fragment, FRAGMENT_TAG).commit();
        }
    }

}
