package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.Rayan.androidjokes.JokeDisplayActivity;


public class MainActivity extends AppCompatActivity {

    public static final String JOKEEXTRA ="joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        Intent intent= new Intent(this, JokeDisplayActivity.class);
        try {
            String joke = new EndpointsAsyncTask().execute().get();
            if (joke != null) {
                intent.putExtra(JOKEEXTRA, joke);
                startActivity(intent);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
