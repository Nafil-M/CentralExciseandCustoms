package com.example.centralexciseandcustoms.Posting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.centralexciseandcustoms.R;

public class PostingActivity extends AppCompatActivity {

    Spinner station,designation,cadre,zone,commissionerate,division,range;

    EditText fromdate,enddate;

    TextView update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);


        station = findViewById(R.id.spinnerstation);
        designation = findViewById(R.id.spinnerdesigpost);
        cadre = findViewById(R.id.spinnercadrepost);
        zone = findViewById(R.id.spinnerzonepost);
        commissionerate = findViewById(R.id.spinnercomm);
        division = findViewById(R.id.spinnerdivisionpost);
        range = findViewById(R.id.spinnerrangepost);
        fromdate = findViewById(R.id.fromdateet);
        enddate = findViewById(R.id.enddateet);
        update = findViewById(R.id.uploadposting);

    }
}