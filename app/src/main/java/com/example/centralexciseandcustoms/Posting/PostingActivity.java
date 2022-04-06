package com.example.centralexciseandcustoms.Posting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.centralexciseandcustoms.OfficialDetails;
import com.example.centralexciseandcustoms.R;

public class PostingActivity extends AppCompatActivity {

    Spinner station,designation,cadre,zone,commissionerate,division,range;

    EditText fromdate,enddate;

    TextView update;

    String fromdateee,enddateee;

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


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fromdateee = fromdate.getText().toString();
                enddateee = enddate.getText().toString();


                if (TextUtils.isEmpty(fromdateee) || TextUtils.isEmpty(enddateee)) {
                    Toast.makeText(PostingActivity.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(PostingActivity.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();
                    fromdate.setText("");
                    enddate.setText("");
                }

            }
        });

    }

    public void onClickBack(View view) {
        finish();
    }
}