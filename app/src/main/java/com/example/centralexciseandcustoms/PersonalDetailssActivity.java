package com.example.centralexciseandcustoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class PersonalDetailssActivity extends AppCompatActivity {

    Spinner maritalstatus,spouseemployed;
    EditText spouseemployement;
    TextView uploadbtn;
    String strspouseemployement;
    public static final int RESULT_LOAD_IMG = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detailss);

        maritalstatus = findViewById(R.id.spinnermaritalstat);
        spouseemployed = findViewById(R.id.spinnerspouseemployed);
        spouseemployement = findViewById(R.id.spouseempet);
        uploadbtn = findViewById(R.id.uploadpersonal);

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