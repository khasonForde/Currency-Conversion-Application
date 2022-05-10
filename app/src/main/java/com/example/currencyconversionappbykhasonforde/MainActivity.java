package com.example.currencyconversionappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CurrencyConverterButton (View v) {
        EditText AmountEditText = (EditText) findViewById(R.id.editTextNumberDecimal);
        String Amount = AmountEditText.getText().toString();

        Intent CurrencyConverterIntent = new Intent(this, Results.class);
        CurrencyConverterIntent.putExtra("Amount", Amount);
        startActivity(CurrencyConverterIntent);
    }
}