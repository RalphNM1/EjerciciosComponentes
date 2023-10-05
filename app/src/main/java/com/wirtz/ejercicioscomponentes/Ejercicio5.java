package com.wirtz.ejercicioscomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Ejercicio5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        ImageButton ibtmenos = (ImageButton) findViewById(R.id.ibtmenos);
        ImageButton ibtmas = (ImageButton) findViewById(R.id.ibtmas);
        EditText etPassegers = (EditText) findViewById(R.id.etPassegers);
        RadioButton btRoundTrip = (RadioButton) findViewById(R.id.btRoundTrip);
        RadioButton btOneWay = (RadioButton) findViewById(R.id.btOneWay);
        RadioButton btHistory = (RadioButton) findViewById(R.id.btHistory);
        RadioButton btNonStop = (RadioButton) findViewById(R.id.btNonStop);
        RadioButton btOneStop = (RadioButton) findViewById(R.id.btOneStop);
        RadioButton bt2ormore = (RadioButton) findViewById(R.id.bt2ormore);
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        Button btSearchFlights = (Button) findViewById(R.id.btSearchFlights);
        Spinner spin_From = (Spinner) findViewById(R.id.spin_From);
        Spinner spin_To = (Spinner) findViewById(R.id.spin_To);
        EditText etDepart = (EditText) findViewById(R.id.etDepart);
        EditText etReturn = (EditText) findViewById(R.id.etReturn);



        ibtmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numPassengers;
                numPassengers = Integer.parseInt(etPassegers.getText().toString());

                if (numPassengers > 0) {
                    numPassengers--;
                }
                etPassegers.setText(String.valueOf(numPassengers));
            }
        });


        ibtmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numPassengers;
                numPassengers = Integer.parseInt(etPassegers.getText().toString());

                if (numPassengers < 19) {
                    numPassengers++;
                }
                etPassegers.setText(String.valueOf(numPassengers));
            }
        });


        btRoundTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btRoundTrip.setBackgroundColor(Color.GREEN);
                btOneWay.setBackgroundColor(Color.WHITE);
                btHistory.setBackgroundColor(Color.WHITE);

            }
        });

        btOneWay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btOneWay.setBackgroundColor(Color.GREEN);
                btRoundTrip.setBackgroundColor(Color.WHITE);
                btHistory.setBackgroundColor(Color.WHITE);


            }
        });


        btHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btHistory.setBackgroundColor(Color.GREEN);
                btOneWay.setBackgroundColor(Color.WHITE);
                btRoundTrip.setBackgroundColor(Color.WHITE);


            }
        });

        btNonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btNonStop.setBackgroundColor(Color.GREEN);
                btOneStop.setBackgroundColor(Color.WHITE);
                bt2ormore.setBackgroundColor(Color.WHITE);

            }
        });

        btOneStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btOneStop.setBackgroundColor(Color.GREEN);
                btNonStop.setBackgroundColor(Color.WHITE);
                bt2ormore.setBackgroundColor(Color.WHITE);


            }
        });


        bt2ormore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bt2ormore.setBackgroundColor(Color.GREEN);
                btNonStop.setBackgroundColor(Color.WHITE);
                btOneStop.setBackgroundColor(Color.WHITE);


            }
        });
        btSearchFlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Resultado= "";
                if(!(spin_From.getSelectedItem().toString().equals("Seleccione un campo"))) {
                       Resultado = "Desde: "+spin_From.getSelectedItem().toString();
                  }

                if(!(spin_To.getSelectedItem().toString().equals("Seleccione un campo"))) {
                    Resultado =Resultado + "\n" +"Hacía: " + spin_To.getSelectedItem().toString() ;
                }

                if(!etDepart.getText().toString().isEmpty()){
                    Resultado = Resultado + "\n" +"Sálida: " + etDepart.getText().toString();

                }

                if(!etReturn.getText().toString().isEmpty()){
                    Resultado = Resultado + "\n" +"Vuelta: " + etReturn.getText().toString() ;

                }

                if(Integer.parseInt(etPassegers.getText().toString()) != 0){
                    Resultado = Resultado + "\n" +"Pasageros: " + etPassegers.getText().toString() ;

                }


                  tvResultado.setText(Resultado);
            }
        });


    }


}