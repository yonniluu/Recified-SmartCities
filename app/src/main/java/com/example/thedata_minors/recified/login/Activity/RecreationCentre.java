package com.example.thedata_minors.recified.login.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.thedata_minors.recified.R;

public class RecreationCentre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recreation_centre);

        Intent myIntent = getIntent();
        String Name = myIntent.getStringExtra("Name");
        String Hours = myIntent.getStringExtra("Hours");
        String Location = myIntent.getStringExtra("Location");
        String Phone = myIntent.getStringExtra("Phone");

        TextView Title_Text = (TextView)findViewById(R.id.Title);
        Title_Text.setText(Name);

        TextView Hours_Text = (TextView)findViewById(R.id.Hours);
        Hours_Text.setText(Hours);

        TextView Location_Text = (TextView)findViewById(R.id.Location);
        Location_Text.setText(Location);

        TextView Phone_Text = (TextView)findViewById(R.id.Phone);
        Phone_Text.setText(Phone);


        addListenerOnSpinnerItemSelection();
    }

    // add items into spinner dynamically

    public void addListenerOnSpinnerItemSelection() {
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
    }


    /** Called when the user clicks the Check in button */
    public void checkIn(View view) {
        Intent intent = new Intent(this, CheckIn.class);
        startActivity(intent);

    }
}