package com.example.thedata_minors.recified.login.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.thedata_minors.recified.R;

/**
 * Created by tiffanyxu on 2016-11-11.
 */

public class CheckIn extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recreation_centre);

            Intent myIntent = getIntent();
            String SportName = myIntent.getStringExtra("SportName");
            String CurrentUsers = myIntent.getStringExtra("CurrentUsers");
            String Capacity = myIntent.getStringExtra("Capacity");
            String Level = myIntent.getStringExtra("Level");
            String Name = myIntent.getStringExtra("Name");

            TextView Title_Text = (TextView)findViewById(R.id.Title);
            Title_Text.setText(SportName);

            TextView Hours_Text = (TextView)findViewById(R.id.Hours);
            Hours_Text.setText(CurrentUsers);

            TextView Location_Text = (TextView)findViewById(R.id.Location);
            Location_Text.setText(Capacity);

            TextView Phone_Text = (TextView)findViewById(R.id.Phone);
            Phone_Text.setText(Level);
        }
    }
