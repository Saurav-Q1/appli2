package com.example.recip2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn26);
        button1=(Button)findViewById(R.id.btn27);
        button2=(Button)findViewById(R.id.btn28);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityOne();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityTow();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitythree();
            }
        });
    }
    public void moveToActivityOne(){
        Intent intent1=new Intent(this,asin_2.class);
        startActivity(intent1);
    }
    public void moveToActivityTow(){
        Intent intent2=new Intent(this,jap_3.class);
        startActivity(intent2);
    }
    public void moveToActivitythree(){
        Intent intent3=new Intent(this,other.class);
        startActivity(intent3);
    }
}

