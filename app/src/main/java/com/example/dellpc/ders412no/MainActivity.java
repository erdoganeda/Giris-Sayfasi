package com.example.dellpc.ders412no;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String[] dizi = {"A","B","C"};

    Button button,btn_ara; EditText edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        btn_ara = findViewById(R.id.btn_ara);
        edt1 = findViewById(R.id.edt1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,Ikincisayfa.class);
                i1.putExtra("ilksayfaverisi",dizi);

                startActivity(i1);
            }
        });

        btn_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+edt1.getText().toString()));
                startActivity(i1);
            }
        });
    }
}
