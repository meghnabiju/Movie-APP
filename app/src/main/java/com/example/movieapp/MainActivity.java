package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1;

    String getuname,getpw;
    String cuname="theater";
    String cpw="1234";
    int un,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.un);
        et2=(EditText) findViewById(R.id.pw);
        b1=(Button) findViewById(R.id.log);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getuname=et1.getText().toString();
                getpw=et2.getText().toString();
                if(getuname.equals(cuname)&&getpw.equals(cpw))
                {
                    Intent ob=new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(ob);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid username",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}