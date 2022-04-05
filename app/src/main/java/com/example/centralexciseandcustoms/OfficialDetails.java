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

    EditText code,email,fname,mname,lname,mobile, dob, doj,dor,education,workexp,
            hometown,homedist,residaddr,residaddr2,residdist,
            residpin,residcity,permaddr,permaddr2,permdist,permpin,permcity;

    String codestr,emailstr,fnamestr,mnamestr,lnamestr,mobilestr, dobstr, dojstr,dorstr,educationstr,workexpstr,
            hometownstr,homediststr,residaddrstr,residaddr2str,residdiststr,
            residpinstr,residcitystr,permaddrstr,permaddr2str,permdiststr,permpinstr,permcitystr;

    Spinner designation,zone,zonecomm,division,range,category,cadre,disability,residstate,permstate;
    TextView uploadbtn;

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
        designation = findViewById(R.id.spinnerdesignation);
        zone = findViewById(R.id.spinnerzone);
        zonecomm = findViewById(R.id.spinnerzone2);
        division = findViewById(R.id.spinnerdivision);
        range = findViewById(R.id.spinnerrange);
        category = findViewById(R.id.spinnercategory);
        cadre = findViewById(R.id.spinnercadre);
        mobile = findViewById(R.id.mobileedit);
        dob = findViewById(R.id.dobet);
        doj = findViewById(R.id.dojet);
        dor = findViewById(R.id.doret);
        disability = findViewById(R.id.spinnerdisability);
        education = findViewById(R.id.eduet);
        workexp = findViewById(R.id.workexpet);
        hometown = findViewById(R.id.hometet);
        homedist = findViewById(R.id.hodistet);
        residaddr = findViewById(R.id.resadd1et);
        residaddr2 = findViewById(R.id.resadd2et);
        residdist = findViewById(R.id.residdistet);
        residpin = findViewById(R.id.residpinet);
        residcity = findViewById(R.id.residcityet);
        residstate = findViewById(R.id.spinnerresidstate);
        permaddr = findViewById(R.id.permenantaddrss1et);
        permaddr2 = findViewById(R.id.permenantaddrss2et);
        permdist = findViewById(R.id.permenantdistet);
        permpin = findViewById(R.id.permenantpinet);
        permcity = findViewById(R.id.permenantcityet);
        permstate = findViewById(R.id.spinnerpermenantstate);


        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                codestr = code.getText().toString();
                emailstr = email.getText().toString();
                fnamestr = fname.getText().toString();
                mnamestr = mname.getText().toString();
                lnamestr = lname.getText().toString();
                mobilestr = mobile.getText().toString();
                dobstr = dob.getText().toString();
                dojstr = doj.getText().toString();
                dorstr = dor.getText().toString();
                educationstr = education.getText().toString();
                workexpstr = workexp.getText().toString();
                hometownstr = hometown.getText().toString();
                homediststr = homedist.getText().toString();
                residaddrstr = residaddr.getText().toString();
                residaddr2str = residaddr2.getText().toString();
                residdiststr = residdist.getText().toString();
                residpinstr = residpin.getText().toString();
                residcitystr = residcity.getText().toString();
                permaddrstr = permaddr.getText().toString();
                permaddr2str = permaddr2.getText().toString();
                permdiststr = permdist.getText().toString();
                permpinstr = residcity.getText().toString();
                permcitystr = residcity.getText().toString();

                if (TextUtils.isEmpty(codestr) || TextUtils.isEmpty(emailstr) || TextUtils.isEmpty(fnamestr) || TextUtils.isEmpty(mnamestr) ||
                TextUtils.isEmpty(lnamestr) || TextUtils.isEmpty(mobilestr) || TextUtils.isEmpty(dobstr) || TextUtils.isEmpty(dojstr) ||
                        TextUtils.isEmpty(dorstr) || TextUtils.isEmpty(educationstr) || TextUtils.isEmpty(workexpstr) || TextUtils.isEmpty(hometownstr) ||
                        TextUtils.isEmpty(homediststr) || TextUtils.isEmpty(residaddrstr) || TextUtils.isEmpty(residaddr2str) || TextUtils.isEmpty(residdiststr)
                        || TextUtils.isEmpty(residpinstr) || TextUtils.isEmpty(residcitystr) || TextUtils.isEmpty(permaddrstr) || TextUtils.isEmpty(permaddr2str)
                        || TextUtils.isEmpty(permdiststr) || TextUtils.isEmpty(permpinstr) || TextUtils.isEmpty(permcitystr) ) {

                    Toast.makeText(OfficialDetails.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(OfficialDetails.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();


                    code.setText("");
                    email.setText("");
                    fname.setText("");
                    mname.setText("");
                    lname.setText("");
                    mobile.setText("");
                    dob.setText("");
                    doj.setText("");
                    dor.setText("");
                    education.setText("");
                    workexp.setText("");
                    hometown.setText("");
                    homedist.setText("");
                    residaddr.setText("");
                    residaddr2.setText("");
                    residdist.setText("");
                    residpin.setText("");
                    residcity.setText("");
                    permaddr.setText("");
                    permaddr2.setText("");
                    permdist.setText("");
                    permpin.setText("");
                    permcity.setText("");

//                    Intent intent = new Intent(OfficialDetails.this,MainActivity.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
//                    startActivity(intent);
                }

            }
        });


    }



    public void onClickBack(View view) {
        finish();
    }
}