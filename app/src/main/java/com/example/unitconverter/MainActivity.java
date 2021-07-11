package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView,textView2,textView4,valueinPound;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);

        valueinPound=findViewById(R.id.ValueOfPound);

        editText=findViewById(R.id.editTextNumber);

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertFromKiloToPound();

            }
        });

    }

    private void ConvertFromKiloToPound() {
        //From Kilo to Pound

        String valueEnteredinKILO= editText.getText().toString();
        double Kilo=Double.parseDouble(valueEnteredinKILO);

        //converting Kilo to Pond formula

        double pound=Kilo*2.205;

        valueinPound.setText("" + pound);


    }
}

