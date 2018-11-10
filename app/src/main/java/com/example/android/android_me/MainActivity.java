package com.example.android.android_me;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.ui.BodyPartFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate the fragment
        BodyPartFragment headFragment = new BodyPartFragment();

        // get support for the fragment + transaction to inflate fragment
        FragmentManager fm = getSupportFragmentManager();
        // transaction gets the container in main_activity, links it to the fragment and commits the transaction
        fm.beginTransaction().add(R.id.head_container, headFragment).commit();
    }
}
