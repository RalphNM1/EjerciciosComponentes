package com.wirtz.ejercicioscomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombre = (EditText) findViewById(R.id.InNombre);
        EditText Apellidos = (EditText) findViewById(R.id.InApellidos);
        EditText Direccion = (EditText) findViewById(R.id.InDireccion);
        EditText email = (EditText) findViewById(R.id.InCorreo);
        EditText telefono = (EditText) findViewById(R.id.InNTelefono);
        EditText edad = (EditText) findViewById(R.id.InEdad);
        EditText fechaNac = (EditText) findViewById(R.id.InFechaNac);
        Button enviarFormulario = (Button) findViewById(R.id.btBotonEnviarFormulario);
        CheckBox Lectura = (CheckBox) findViewById(R.id.cb_lectura);
        CheckBox Deportes = (CheckBox) findViewById(R.id.cb_deportes);
        CheckBox Videojuegos = (CheckBox) findViewById(R.id.cb_videojuegos);
        EditText contra = (EditText) findViewById(R.id.InContrasena);
        TextView Datos = (TextView) findViewById(R.id.tvErrores);
        RadioButton hombre = (RadioButton) findViewById(R.id.rbHombre);
        RadioButton mujer = (RadioButton) findViewById(R.id.rbMujer);
        enviarFormulario.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Datos.setText("");
               String Mensaje="";
               boolean ok = true;
               Pattern pattern = Patterns.EMAIL_ADDRESS;


               if(nombre.getText().toString().isEmpty()){

                Mensaje = "\nNombre está vacío";
                   Datos.setText(Datos.getText() + Mensaje );
                ok = false;
               }

               if(Apellidos.getText().toString().isEmpty()){

                   Mensaje = "\nApellidos está vacío";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }

               if(Direccion.getText().toString().isEmpty()){

                   Mensaje = "\nDirección está vacío";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }

               if(email.getText().toString().isEmpty()){

                   Mensaje = "\nEmail está vacío";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }

               if(!(pattern.matcher(email.getText()).matches())){

                   Mensaje = "\nEmail es incorrecto";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }



               if(telefono.getText().toString().isEmpty()){

                   Mensaje = "\nTeléfono está vacío";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }

               if(edad.getText().toString().isEmpty()){

                   Mensaje = "\nEdad está vacío";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }

               if(fechaNac.getText().toString().isEmpty()){

                   Mensaje = "\nFecha de nacimiento está vacía";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }

               if(contra.getText().toString().isEmpty()){

                   Mensaje = "\nContraseña está vacía";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }


               if(!(TextUtils.equals(contra.getText(),"ejerciciO3"))){

                   Mensaje = "\nContraseña no coincide";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;
               }


               if(!(Lectura.isChecked() || Deportes.isChecked()  || Videojuegos.isChecked() )){

                   Mensaje = "\nSeleccione alguna aficion";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;

               }

               if (hombre.isActivated() || mujer.isActivated()){
                   Mensaje = "\nSeleccione un género";
                   Datos.setText(Datos.getText() + Mensaje );
                   ok = false;

               }


               if (ok == true){

                   Toast.makeText(view.getContext(), "Formulario enviado", Toast.LENGTH_SHORT).show();
                   ok=false;



                  if(Lectura.isChecked()) {
                      Mensaje = Mensaje + " Lectura seleccionada";

                      if (Deportes.isChecked()) {
                          Mensaje = Mensaje + " Deportes seleccionada";

                          if (Videojuegos.isChecked()) {
                              Mensaje = Mensaje + " Videojuegos seleccionado";

                          }
                      }
                  }
                  if (hombre.isChecked()) {
                      Mensaje = Mensaje + " Género: Hombre";
                  }

                  if(mujer.isChecked()){
                      Mensaje = Mensaje + " Género: Mujer";

                  }

                   Datos.setText("Nombre: " + nombre.getText().toString() + " Apellidos: " + Apellidos.getText().toString() + " Dirección: "+Direccion.getText().toString()
                                +" Correo: " + email.getText().toString() + " Teléfono: " + telefono.getText().toString() + " Edad: " + edad.getText().toString() + " Fecha de nacimiento: " +fechaNac.getText().toString() + " Contraseña: " + contra.getText().toString() + Mensaje
                   );

               }


           }
       });


        /*
         Que los campos de nombre, email y teléfono no están vacíos.
         Que el email es un email válido.
         Que se ha seleccionado alguna afición en los checkbox.
         Que la contraseña coincide exactamente con “ejerciciO3”.
             Si se envía el formulario con todas las comprobaciones correctas deberá mostrar el
            texto “Formulario enviado”, mostrando debajo los valores enviados. - TOAST
        */



            }

        }



