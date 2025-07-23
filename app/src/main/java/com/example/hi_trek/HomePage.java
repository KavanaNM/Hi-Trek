package com.example.hi_trek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomePage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    CardView cardview1,cardview2,cardview3,cardview4,cardview5,cardview6,cardview7,cardview8;
    TextView nanditext,skandatext;
    BottomNavigationView bottomNavigationView;
    FloatingActionButton mapbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);
        cardview1 = findViewById(R.id.cardview1);
        cardview2 = findViewById(R.id.cardview2);
        nanditext = findViewById(R.id.nanditext);
        skandatext = findViewById(R.id.skandatext);
        cardview3 = findViewById(R.id.cardview3);
        cardview4 = findViewById(R.id.cardview4);
        cardview5 = findViewById(R.id.cardview5);
        cardview6 = findViewById(R.id.cardview6);
        cardview7 = findViewById(R.id.cardview7);
        cardview8 = findViewById(R.id.cardview8);
        mapbtn = findViewById(R.id.maps);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);


        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,NandiHills.class);
                startActivity(intent);
            }
        });
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,SkandaGiri.class);
                startActivity(intent);
            }
        });
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,MakaliDurga.class);
                startActivity(intent);
            }
        });
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,SavanDurga.class);
                startActivity(intent);
            }
        });
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,Kumara.class);
                startActivity(intent);
            }
        });
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,Kudremukh.class);
                startActivity(intent);
            }
        });
        cardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,KabbeHills.class);
                startActivity(intent);
            }
        });
        cardview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,Tadiandamol.class);
                startActivity(intent);
            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.help:
                Toast.makeText(getApplicationContext(),"Help required",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(getApplicationContext(), "Searching", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.account:
                Toast.makeText(getApplicationContext(), "Account details", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.home:
                Toast.makeText(this, "Home Page", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}