package com.example.centralexciseandcustoms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OfficialDetails extends AppCompatActivity {

    EditText empid,workplace,dateofj,startdate,enddate,designation;
    TextView uploadbtn;
    String id,place,dateofjo,start,end,des;
    OfficialDetailsAdapter officialDetailsAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_official_details);

        uploadbtn = findViewById(R.id.uploadofficial);
        empid = findViewById(R.id.empidedit);
        workplace = findViewById(R.id.workplaceedit);
        dateofj = findViewById(R.id.dateofjedit);
        startdate = findViewById(R.id.startdateedit);
        enddate = findViewById(R.id.enddateedit);
        designation = findViewById(R.id.desigedit);
        recyclerView = findViewById(R.id.recyclerview);
        officialDetailsAdapter = new OfficialDetailsAdapter(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(officialDetailsAdapter);


        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                id = empid.getText().toString();
                place = workplace.getText().toString();
                dateofjo = dateofj.getText().toString();
                start = startdate.getText().toString();
                end = enddate.getText().toString();
                des = designation.getText().toString();


                if (TextUtils.isEmpty(id) || TextUtils.isEmpty(place) || TextUtils.isEmpty(dateofjo) || TextUtils.isEmpty(start) || TextUtils.isEmpty(end) || TextUtils.isEmpty(des)) {
                    Toast.makeText(OfficialDetails.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(OfficialDetails.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();
                    workplace.setText("");
                    dateofj.setText("");
                    startdate.setText("");
                    enddate.setText("");
                    designation.setText("");

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