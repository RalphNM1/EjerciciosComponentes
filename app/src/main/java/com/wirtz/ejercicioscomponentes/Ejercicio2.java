package com.wirtz.ejercicioscomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {
    boolean colorB = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        TextView numero = (TextView) findViewById(R.id.tvTexto1);
        Button aumentar = (Button) findViewById(R.id.btBoton1);
        Button disminuir = (Button) findViewById(R.id.btBoton2);


        aumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num;
                num = Integer.parseInt(numero.getText().toString());

                num++;

                numero.setText(String.valueOf(num));


                if (colorB == false) {
                    numero.setTextColor(Color.RED);

                    colorB = true;
                } else {
                    numero.setTextColor(Color.GREEN);
                    colorB = false;
                }


            }
        });

        disminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num;
                num = Integer.parseInt(numero.getText().toString());


                if (num > 0) {
                    num--;


                    if (colorB == false) {
                        numero.setTextColor(Color.RED);

                        colorB = true;
                    } else {
                        numero.setTextColor(Color.GREEN);
                        colorB = false;
                    }

                }


                numero.setText(String.valueOf(num));


            }
        });


    }
}