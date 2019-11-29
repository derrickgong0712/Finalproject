package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forinputdata = findViewById(R.id.data);
        forinputdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendraftdata();
            }
        });

    }
    public void opendraftdata() {
        Intent intent = new Intent(this, Draftdata.class);
        startActivity(intent);
        finish();
    }

}
