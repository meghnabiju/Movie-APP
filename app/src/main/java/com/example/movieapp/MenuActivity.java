package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        b1=(Button) findViewById(R.id.a);
        b2=(Button) findViewById(R.id.b);
        b3=(Button) findViewById(R.id.c);
        b4=(Button) findViewById(R.id.d);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob=new Intent(getApplicationContext(), AddMovieActivity.class);
                startActivity(ob);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(getApplicationContext(), ViewMovieActivity.class);
                startActivity(obj);
            }
        });


    }
}