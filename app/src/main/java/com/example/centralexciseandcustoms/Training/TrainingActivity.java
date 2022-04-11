package com.example.centralexciseandcustoms.Training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.centralexciseandcustoms.OfficialDetails;
import com.example.centralexciseandcustoms.R;

public class TrainingActivity extends AppCompatActivity {


    EditText trainingname,trainingfromdate,trainingenddate,trainingorg,trainingloc;

    String trainingnamestr,trainingfromdatestr,trainingenddatestr,trainingorgstr,traininglocstr;

    TextView upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        trainingname = findViewById(R.id.trainingnameet);
        trainingfromdate = findViewById(R.id.trainingfromet);
        trainingenddate = findViewById(R.id.trainingendet);
        trainingorg = findViewById(R.id.trainingorget);
        trainingloc = findViewById(R.id.traininglocet);
        upload = findViewById(R.id.uploadtraining);


        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trainingnamestr = trainingname.getText().toString();
                trainingfromdatestr = trainingfromdate.getText().toString();
                trainingenddatestr = trainingenddate.getText().toString();
                trainingorgstr = trainingorg.getText().toString();
                traininglocstr = trainingloc.getText().toString();

                if (TextUtils.isEmpty(trainingnamestr) || TextUtils.isEmpty(trainingfromdatestr) || TextUtils.isEmpty(trainingenddatestr) ||
                        TextUtils.isEmpty(trainingorgstr) || TextUtils.isEmpty(traininglocstr) ){

                    Toast.makeText(TrainingActivity.this, "All Fields are Important", Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(TrainingActivity.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();

                    trainingname.setText("");
                    trainingfromdate.setText("");
                    trainingenddate.setText("");
                    trainingorg.setText("");
                    trainingloc.setText("");

                }

            }
        });


    }
    public void onClickBack(View view) {
        finish();
    }
}