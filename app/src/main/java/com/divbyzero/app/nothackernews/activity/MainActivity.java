package com.divbyzero.app.nothackernews.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.divbyzero.app.nothackernews.R;

public class MainActivity extends AppCompatActivity {

    TextView txtLastFavorite;
    RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Story Detail");

        txtLastFavorite = (TextView) findViewById(R.id.txtLastFavorite);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 123){
            if (resultCode == RESULT_OK){
                txtLastFavorite.setText(data.getStringExtra("theValue"));
            }
        }
    }
}
