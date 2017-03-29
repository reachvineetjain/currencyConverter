package com.nehvin.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert (View view)
    {
        EditText amt = (EditText) findViewById(R.id.editText);
        Double flt_amt = Double.parseDouble(amt.getText().toString());
        Double converted = flt_amt * 67;
        Toast.makeText(this, "Rs "+converted, Toast.LENGTH_LONG).show();
    }
}
