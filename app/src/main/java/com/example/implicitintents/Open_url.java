package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Open_url extends AppCompatActivity {

    private EditText editText;
    private Button load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_url);

        editText = findViewById(R.id.edittext);
        load = findViewById(R.id.loadBtn);


        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String URL = editText.getText().toString();
                Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse(URL));
                startActivity(intent);
            }
        });
    }
}