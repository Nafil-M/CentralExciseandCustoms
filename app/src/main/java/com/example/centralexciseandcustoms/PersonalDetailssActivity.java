package com.example.centralexciseandcustoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class PersonalDetailssActivity extends AppCompatActivity {

    Spinner maritalstatus,spouseemployed;
    EditText spouseemployement;
    TextView uploadbtn;
    String strspouseemployement;
    public String maritalstatusselect;
    public static final int RESULT_LOAD_IMG = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detailss);

        maritalstatus = findViewById(R.id.spinnermaritalstat);
        spouseemployed = findViewById(R.id.spinnerspouseemployed);
        spouseemployement = findViewById(R.id.spouseempet);
        uploadbtn = findViewById(R.id.uploadpersonal);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("MARRIED");
        arrayList.add("SINGLE");
        arrayList.add("SEPERATED");
        arrayList.add("DIVORCED");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,                         android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maritalstatus.setAdapter(arrayAdapter);
        maritalstatus.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                maritalstatusselect = parent.getItemAtPosition(position).toString();

                if (maritalstatusselect.equals("SINGLE") || maritalstatusselect.equals("SEPERATED") || maritalstatusselect.equals("DIVORCED") ){
                    spouseemployed.setEnabled(false);
                    spouseemployed.setClickable(false);

                    spouseemployement.setEnabled(false);
                }else {
                    spouseemployed.setEnabled(true);
                    spouseemployed.setClickable(true);

                    spouseemployement.setEnabled(true);
                }
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });




        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                strspouseemployement = spouseemployement.getText().toString();



                if (TextUtils.isEmpty(strspouseemployement)) {
                    Toast.makeText(PersonalDetailssActivity.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(PersonalDetailssActivity.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PersonalDetailssActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }


            }
        });

    }

    public void onClickBack(View view) {
        finish();
    }
}