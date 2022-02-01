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
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class PersonalDetailssActivity extends AppCompatActivity {

    ImageView profile;
    EditText name, address, mobile, dob, email;
    TextView uploadbtn;
    String namee,addr,mob,dobb,emaill;
    public static final int RESULT_LOAD_IMG = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detailss);

        profile = findViewById(R.id.ivProfileImage);
        name = findViewById(R.id.edittextt);
        address = findViewById(R.id.edittextt2);
        mobile = findViewById(R.id.edittext3);
        dob = findViewById(R.id.edittext4);
        email = findViewById(R.id.edittext5);
        uploadbtn = findViewById(R.id.uploadpersonal);



        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, RESULT_LOAD_IMG);
            }

        });

        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                namee = name.getText().toString();
                addr = address.getText().toString();
                mob = mobile.getText().toString();
                dobb = dob.getText().toString();
                emaill = email.getText().toString();



                if (TextUtils.isEmpty(namee) || TextUtils.isEmpty(addr) || TextUtils.isEmpty(mob) || TextUtils.isEmpty(dobb) || TextUtils.isEmpty(emaill)) {
                    Toast.makeText(PersonalDetailssActivity.this, "All Fields are Important", Toast.LENGTH_SHORT).show();
                }
                else if (mob.length() != 10){
                    Toast.makeText(PersonalDetailssActivity.this, "Invalid Mobile Number", Toast.LENGTH_SHORT).show();
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

    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);


        if (resultCode == RESULT_OK) {
            try {
                final Uri imageUri = data.getData();
                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                profile.setImageBitmap(selectedImage);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(PersonalDetailssActivity.this, "Something went wrong", Toast.LENGTH_LONG).show();
            }

        }else {
            Toast.makeText(PersonalDetailssActivity.this, "You haven't picked Image",Toast.LENGTH_LONG).show();
        }
    }

    public void onClickBack(View view) {
        finish();
    }
}