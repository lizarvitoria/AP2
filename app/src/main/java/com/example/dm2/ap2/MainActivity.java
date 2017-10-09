package com.example.dm2.ap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private Button btnsuma;
    private Button btnresta;
    private Button btnmult;
    private Button btndiv;
    private TextView lblsuma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        btnsuma = (Button)findViewById(R.id.btnsuma);
        btnresta = (Button)findViewById(R.id.btnresta);
        btnmult = (Button)findViewById(R.id.btnmult);
        btndiv = (Button)findViewById(R.id.btndiv);
        lblsuma = (TextView)findViewById(R.id.lblsuma);
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                operar(1);
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                operar(2);
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                operar(3);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                operar(4);
            }
        });
    }

    public void operar(int i){
        switch (i){
            case 1:  lblsuma.setText("Resultado: "+(Integer.parseInt(valor1.getText().toString())+Integer.parseInt(valor2.getText().toString())));
                     break;

            case 2:  lblsuma.setText("Resultado: "+(Integer.parseInt(valor1.getText().toString())-Integer.parseInt(valor2.getText().toString())));
                     break;

            case 3:  lblsuma.setText("Resultado: "+(Integer.parseInt(valor1.getText().toString())*Integer.parseInt(valor2.getText().toString())));
                     break;

            case 4:  lblsuma.setText("Resultado: "+(Double.parseDouble(valor1.getText().toString())/Double.parseDouble(valor2.getText().toString())));
                     break;
        }
    }
}
