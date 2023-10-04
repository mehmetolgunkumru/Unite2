package com.example.unite2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
                startActivity(i);
    }

    public void uyg5Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg5.class);
    }

    public void Uyg4Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg4.class);

    }
}