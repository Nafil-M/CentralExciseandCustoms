package com.example.centralexciseandcustoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class PersonalDetailssActivity extends AppCompatActivity {

    Spinner maritalstatus,spouseemployed;
    EditText spousename,childname;
    TextView uploadbtn,edit,addmore;
    EditText child1,child2,child3,child4,child5,child6,child7,child8,
            child9,child10,child11,child12,child13,child14,child15,
            child16,child17,child18,child19,child20,child21,child22;

    public String maritalstatusselect,spouseemployedselect;

//    private RelativeLayout parentLayout;
    private int hint=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detailss);

//        parentLayout = findViewById(R.id.parentlayout);
        maritalstatus = findViewById(R.id.spinnermaritalstat);
        spouseemployed = findViewById(R.id.spinnerspouseemployed);
        spousename = findViewById(R.id.spousenameet);
        childname = findViewById(R.id.childnameet);
        edit = findViewById(R.id.editt);
        addmore = findViewById(R.id.addmore);

        child1 = findViewById(R.id.child1);
        child2 = findViewById(R.id.child2);
        child3 = findViewById(R.id.child3);
        child4 = findViewById(R.id.child4);
        child5 = findViewById(R.id.child5);
        child6 = findViewById(R.id.child6);
        child7 = findViewById(R.id.child7);
        child8 = findViewById(R.id.child8);
        child9 = findViewById(R.id.child9);
        child10 = findViewById(R.id.child10);
        child11 = findViewById(R.id.child11);
        child12 = findViewById(R.id.child12);
        child13 = findViewById(R.id.child13);
        child14 = findViewById(R.id.child14);
        child15 = findViewById(R.id.child15);
        child16 = findViewById(R.id.child16);
        child17 = findViewById(R.id.child17);
        child18 = findViewById(R.id.child18);
        child19 = findViewById(R.id.child19);
        child20 = findViewById(R.id.child20);
        child21 = findViewById(R.id.child21);
        child22 = findViewById(R.id.child22);


        uploadbtn = findViewById(R.id.uploadpersonal);

        uploadbtn.setEnabled(false);
        addmore.setEnabled(false);
        maritalstatus.setEnabled(false);
        spouseemployed.setEnabled(false);
        spousename.setEnabled(false);
        childname.setEnabled(false);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                uploadbtn.setEnabled(true);
//                addmore.setEnabled(true);
                maritalstatus.setEnabled(true);
//                spouseemployed.setEnabled(true);
//                spousename.setEnabled(true);
//                childname.setEnabled(true);

            }
        });

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("SINGLE");
        arrayList.add("MARRIED");
        arrayList.add("DIVORCED");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,                         android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maritalstatus.setAdapter(arrayAdapter);
        maritalstatus.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                maritalstatusselect = parent.getItemAtPosition(position).toString();

                if (maritalstatusselect.equals("SINGLE") || maritalstatusselect.equals("DIVORCED") ){
                    spouseemployed.setEnabled(false);
                    spousename.setEnabled(false);
                    childname.setEnabled(false);
                }else {
                    spouseemployed.setEnabled(true);
                    spousename.setEnabled(true);
                    childname.setEnabled(true);
                }
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("GOVERNMENT");
        arrayList2.add("PRIVATE");
        arrayList2.add("HOME MAKER");
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spouseemployed.setAdapter(arrayAdapter2);
        spouseemployed.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                spouseemployedselect = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        addmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                createEditTextView();
                hint++;

                if (hint == 1){
                    child1.setVisibility(View.VISIBLE);
                }
                if (hint == 2){
                    child2.setVisibility(View.VISIBLE);
                }
                if (hint == 3){
                    child3.setVisibility(View.VISIBLE);
                }
                if (hint == 4){
                    child4.setVisibility(View.VISIBLE);
                }
                if (hint == 5){
                    child5.setVisibility(View.VISIBLE);
                }

                if (hint == 6){
                    child6.setVisibility(View.VISIBLE);
                }

                if (hint == 7){
                    child7.setVisibility(View.VISIBLE);
                }

                if (hint == 8){
                    child8.setVisibility(View.VISIBLE);
                }
                if (hint == 9){
                    child9.setVisibility(View.VISIBLE);
                }
                if (hint == 10){
                    child10.setVisibility(View.VISIBLE);
                }
                if (hint == 11){
                    child11.setVisibility(View.VISIBLE);
                }
                if (hint == 12){
                    child12.setVisibility(View.VISIBLE);
                }
                if (hint == 13){
                    child13.setVisibility(View.VISIBLE);
                }
                if (hint == 14){
                    child14.setVisibility(View.VISIBLE);
                }
                if (hint == 15){
                    child15.setVisibility(View.VISIBLE);
                }
                if (hint == 16){
                    child16.setVisibility(View.VISIBLE);
                }
                if (hint == 17){
                    child17.setVisibility(View.VISIBLE);
                }
                if (hint == 18){
                    child18.setVisibility(View.VISIBLE);
                }
                if (hint == 19){
                    child19.setVisibility(View.VISIBLE);
                }
                if (hint == 20){
                    child20.setVisibility(View.VISIBLE);
                }
                if (hint == 21){
                    child21.setVisibility(View.VISIBLE);
                }
                if (hint == 22){
                    child22.setVisibility(View.VISIBLE);
                }

            }
        });

        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(PersonalDetailssActivity.this, "Uploaded Succesfully..!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PersonalDetailssActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

            }
        });

    }

//    protected void createEditTextView() {
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams (
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.MATCH_PARENT);
//        params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//        params.setMargins(0,10,30,10);
//        EditText edittTxt = new EditText(this);
//        int maxLength = 20;
//        hint++;
//        edittTxt.setHint("editText"+hint);
//        edittTxt.setLayoutParams(params);
//        // edtTxt.setBackgroundColor(Color.WHITE);
//        edittTxt.setInputType(InputType.TYPE_CLASS_TEXT);
//        edittTxt.setTextSize(TypedValue.COMPLEX_UNIT_SP,22);
//
//        edittTxt.setId(hint);
//        InputFilter[] fArray = new InputFilter[1];
//        fArray[0] = new InputFilter.LengthFilter(maxLength);
//        edittTxt.setFilters(fArray);
//        parentLayout.addView(edittTxt);
//    }

    public void onClickBack(View view) {
        finish();
    }
}