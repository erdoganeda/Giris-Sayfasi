package com.example.dellpc.ders412no;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Ikincisayfa extends AppCompatActivity {

    Bundle bdn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikincisayfa);

        bdn = getIntent().getExtras();
        String[] yenidizi = bdn.getStringArray("ilksayfaverisi");

        Toast.makeText(this, yenidizi[0].toString(), Toast.LENGTH_LONG).show();
    }
}
