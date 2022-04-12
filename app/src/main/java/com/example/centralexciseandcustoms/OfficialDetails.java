package com.example.centralexciseandcustoms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OfficialDetails extends AppCompatActivity {

    EditText code,email,fname,mname,lname, dob, doj,residaddr,designation;

    String codestr,emailstr,fnamestr,mnamestr,lnamestr, dobstr, dojstr,residaddrstr;

    TextView uploadbtn,edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_official_details);

        uploadbtn = findViewById(R.id.uploadofficial);
        code = findViewById(R.id.codeedit);
        email = findViewById(R.id.emailedit);
        fname = findViewById(R.id.firstnameedit);
        mname = findViewById(R.id.middlenameedit);
        lname = findViewById(R.id.lastnameedit);
        designation = findViewById(R.id.desigedit);
        dob = findViewById(R.id.dobet);
        doj = findViewById(R.id.dojet);
        residaddr = findViewById(R.id.resadd1et);
        edit = findViewById(R.id.edit);

        uploadbtn.setEnabled(false);

        code.setEnabled(false);
        email.setEnabled(false);
        fname.setEnabled(false);
        mname.setEnabled(false);
        lname.setEnabled(false);
        designation.setEnabled(false);
        dob.setEnabled(false);
        doj.setEnabled(false);
        residaddr.setEnabled(false);

        code.setText("1234");


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uploadbtn.setEnabled(true);

                code.setEnabled(true);
                email.setEnabled(true);
                fname.setEnabled(true);
                mname.setEnabled(true);
                lname.setEnabled(true);
                designation.setEnabled(true);
                dob.setEnabled(true);
                doj.setEnabled(true);
                residaddr.setEnabled(true);
            }
        });


        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                codestr = code.getText().toString();
                emailstr = email.getText().toString();
                fnamestr = fname.getText().toString();
                mnamestr = mname.getText().toString();
                lnamestr = lname.getText().toString();
                dobstr = dob.getText().toString();
                dojstr = doj.getText().toString();
                residaddrstr = residaddr.getText().toString();

                if (TextUtils.isEmpty(codestr) || TextUtils.isEmpty(emailstr) || TextUtils.isEmpty(fnamestr) ||
                TextUtils.isEmpty(lnamestr) || TextUtils.isEmpty(dobstr) || TextUtils.isEmpty(dojstr) ||
                        TextUtils.isEmpty(residaddrstr) ) {

                    Toast.makeText(OfficialDetails.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(OfficialDetails.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OfficialDetails.this,MainActivity.class);
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