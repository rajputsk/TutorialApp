package com.example.skrajput.tutorialapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.contains,new MainList());
        ft.commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.item_home){
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId()==R.id.item_rateus){
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.contains,new RatingbarFragment());
            ft.commit();
        }
        else if (item.getItemId()==R.id.item_exit){
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
