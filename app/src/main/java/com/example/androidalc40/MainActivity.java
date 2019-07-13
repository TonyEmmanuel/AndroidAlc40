package com.example.androidalc40;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutActivity(View view) {
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
    }


    public void openMyProfileActivity(View view) {
        Intent create = new Intent(MainActivity.this, Create.class);
        startActivity(create);
    }
}
