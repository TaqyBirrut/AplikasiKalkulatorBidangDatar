package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editLbr, editPnjg;
    TextView textLs, textKllng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent(){
        editPnjg = findViewById(R.id.editPnjg);
        editLbr = findViewById(R.id.editLbr);
        textLs = findViewById(R.id.textLs);
        textKllng = findViewById(R.id.textKllng);
    }

    public void hitungPersegi(View v){
        double panjang = Double.parseDouble(editPnjg.getText().toString());
        double lebar = Double.parseDouble(editLbr.getText().toString());

        double luas = panjang * lebar;
        double keliling = 2 * panjang + 2 * lebar;

        textLs.setText("Luas= "+luas);
        textKllng.setText("Keliling= "+keliling);
    }

    public void hitungSegitiga(View v){
        double alas = Double.parseDouble(editPnjg.getText().toString());
        double tinggi = Double.parseDouble(editLbr.getText().toString());

//        Hipotenussa

        float a2 = (float)Math.pow(tinggi, 2);
        float b2 = (float)Math.pow(alas/2, 2);
        float hipotenussa = (float) Math.sqrt(a2 + b2);

        double luas = (alas * tinggi)/2;
        double keliling = alas + hipotenussa * 2;

        textLs.setText("Luas= "+luas);
        textKllng.setText("Keliling= "+keliling);
    }

    public void hitungLingkaran(View v){
        float diameter = Float.parseFloat(editPnjg.getText().toString());
        float jari = diameter/2;

        double luas = Math.PI * Math.sqrt(jari);
        double keliling = 2 * Math.PI * jari;

        textLs.setText("Luas= "+luas);
        textKllng.setText("Keliling= "+keliling);

    }

}