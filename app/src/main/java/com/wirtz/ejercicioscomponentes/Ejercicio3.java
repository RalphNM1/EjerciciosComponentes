package com.wirtz.ejercicioscomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class Ejercicio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        Button btGenerarTabla = (Button) findViewById(R.id.btGenerarTabla);
        EditText etFilas = (EditText) findViewById(R.id.EtFilas);
        EditText etColumnas = (EditText) findViewById(R.id.EtColumnas);
        TableLayout TlTabla = (TableLayout) findViewById(R.id.GlTabla);


        btGenerarTabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TlTabla.removeAllViews();
                try {
                    int NFilas = Integer.parseInt(etFilas.getText().toString());
                    int NColumnas = Integer.parseInt(etColumnas.getText().toString());



                    for (int i = 0; i < NFilas; i++) {
                        TableRow TFila = new TableRow(view.getContext());

                        for (int j = 0; j <NColumnas ; j++) {
                            ImageView imagen = new ImageView(view.getContext());
                            imagen.setImageResource(R.drawable.android);


                            TFila.addView(imagen);

                        }
                        TlTabla.addView(TFila);

                    }


                } catch (NumberFormatException nFE) {

                    Toast.makeText(view.getContext(), "Ingrese datos en los campos", Toast.LENGTH_SHORT).show();

                }


            }


        });


    }


}