package com.example.centralexciseandcustoms.Awards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.centralexciseandcustoms.Posting.PostingActivity;
import com.example.centralexciseandcustoms.R;

public class AwardsActivity extends AppCompatActivity {

    EditText awardname,awarddate,awardorg,awardremark;
    TextView upload;
    String strawardname,strawarddate,strawardorg,strawardremark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awards);


        awardname = findViewById(R.id.awardnameet);
        awarddate = findViewById(R.id.awarddateet);
        awardorg = findViewById(R.id.awardorganisationet);
        awardremark = findViewById(R.id.awardsremarkset);
        upload = findViewById(R.id.uploadawards);



        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strawardname = awardname.getText().toString();
                strawarddate = awarddate.getText().toString();
                strawardorg = awardorg.getText().toString();
                strawardremark = awardremark.getText().toString();


                if (TextUtils.isEmpty(strawardname) || TextUtils.isEmpty(strawarddate) || TextUtils.isEmpty(strawardorg) || TextUtils.isEmpty(strawardremark)) {
                    Toast.makeText(AwardsActivity.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(AwardsActivity.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();
                    awardname.setText("");
                    awarddate.setText("");
                    awardorg.setText("");
                    awardremark.setText("");
                }

            }
        });



    }

    public void onClickBack(View view) {
        finish();
    }
}