package com.divbyzero.app.nothackernews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.divbyzero.app.nothackernews.R;

public class PostDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);
        /*
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iii = new Intent();
                iii.putExtra("theValue", edt2.getText().toString());
                setResult(RESULT_OK, iii);
                finish();
            }
        });
        */

    }
}
