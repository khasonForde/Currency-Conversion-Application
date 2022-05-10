package com.example.currencyconversionappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.currencyconversionappbykhasonforde.CurrencyConverter.USDtoEuros;
import static com.example.currencyconversionappbykhasonforde.CurrencyConverter.USDtoPounds;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent CurrencyConverterIntent = getIntent();
        String Amount = CurrencyConverterIntent.getStringExtra("Amount");

        double AMT = Double.parseDouble(Amount);

        TextView PoundsScreen = (TextView) findViewById(R.id.textView);
        PoundsScreen.setText("British Pounds: " + CurrencyConverter.USDtoPounds(AMT));

        TextView EurosScreen = (TextView) findViewById(R.id.textView3);
        EurosScreen.setText("Euros: " + CurrencyConverter.USDtoEuros(AMT));
    }
}