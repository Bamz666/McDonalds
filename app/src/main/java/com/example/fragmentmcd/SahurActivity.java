package com.example.fragmentmcd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SahurActivity extends AppCompatActivity {

    public ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahur);

        Spinner spinner = findViewById(R.id.spinner);
        TextView textView = findViewById(R.id.text_view);

        ArrayList<String> list = new ArrayList<>();
        list.add("Choose your nickname");
        list.add("Bamz Wongs");
        list.add("Otong Surotong");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
                textView.setText(selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                textView.setText("");
            }
        });


        imgBack = findViewById(R.id.kembali);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView txt1, txt2;
        txt1 = findViewById(R.id.male);
        txt2 = findViewById(R.id.female);

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.getBackground().clearColorFilter();
                txt1.getBackground().setColorFilter(SahurActivity.this.getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.getBackground().clearColorFilter();
                txt2.getBackground().setColorFilter(SahurActivity.this.getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
            }
        });
    }
}
