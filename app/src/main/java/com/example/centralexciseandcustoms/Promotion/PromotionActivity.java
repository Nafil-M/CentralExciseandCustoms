package com.example.centralexciseandcustoms.Promotion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.centralexciseandcustoms.Posting.PostingActivity;
import com.example.centralexciseandcustoms.R;

public class PromotionActivity extends AppCompatActivity {


    EditText promoname,promodate,promoremarks;

    String promonamestr,promodatestr,promoremarksstr;

    TextView update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);

        promoname = findViewById(R.id.promotionnameet);
        promodate = findViewById(R.id.promotiondateet);
        promoremarks = findViewById(R.id.promotionremarkset);

        update = findViewById(R.id.uploadpromotion);


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                promonamestr = promoname.getText().toString();
                promodatestr = promodate.getText().toString();
                promoremarksstr = promoremarks.getText().toString();

                if (TextUtils.isEmpty(promonamestr) || TextUtils.isEmpty(promodatestr) || TextUtils.isEmpty(promoremarksstr)) {
                    Toast.makeText(PromotionActivity.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(PromotionActivity.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();
                    promoname.setText("");
                    promodate.setText("");
                    promoremarks.setText("");
                }

            }
        });
    }
}