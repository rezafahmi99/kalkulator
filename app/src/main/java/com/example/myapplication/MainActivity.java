package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText angka1EditText;
    private EditText angka2EditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka1EditText = findViewById(R.id.angka1EditText);
        angka2EditText = findViewById(R.id.angka2EditText);
        hasilTextView = findViewById(R.id.hasilTextView);
    }


    public void tambah(View view) {
        int angka1 = Integer.parseInt(angka1EditText.getText().toString());
        int angka2 = Integer.parseInt(angka2EditText.getText().toString());
        int hasil = angka1 + angka2;
        hasilTextView.setText(String.valueOf(hasil));
    }

    public void kurang(View view) {
        int angka1 = Integer.parseInt(angka1EditText.getText().toString());
        int angka2 = Integer.parseInt(angka2EditText.getText().toString());
        int hasil = angka1 - angka2;
        hasilTextView.setText(String.valueOf(hasil));
    }
    public void kali(View view) {
        int angka1 = Integer.parseInt(angka1EditText.getText().toString());
        int angka2 = Integer.parseInt(angka2EditText.getText().toString());
        int hasil = angka1 * angka2;
        hasilTextView.setText(String.valueOf(hasil));
    }
    public void bagi(View view) {
        int angka1 = Integer.parseInt(angka1EditText.getText().toString());
        int angka2 = Integer.parseInt(angka2EditText.getText().toString());
        float hasil = (float) angka1 / angka2;
        hasilTextView.setText(String.valueOf(hasil));
    }
}