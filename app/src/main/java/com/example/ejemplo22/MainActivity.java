package com.example.ejemplo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mostrarDialogoSeleccionSimple(View view) {
        DialogoSeleccionSimple seleccionsimple  = new DialogoSeleccionSimple();
        seleccionsimple .show(getFragmentManager(), "Cuadro selección simple");
    }

    public void mostrarDialogoSeleccionRadio(View view) {
        DialogoSeleccionRadio seleccionradio  = new DialogoSeleccionRadio();
        seleccionradio .show(getFragmentManager(), "Cuadro selección radio");
    }

    public void mostrarDialogoConfirmacion(View view) {
        DialogoConfirmacion confirmacion  = new DialogoConfirmacion();
        confirmacion .show(getFragmentManager(), "Cuadro confirmación");
    }
    public void capturarSeleccionadosinglechoice(String dato) {
        Toast.makeText(this, "Se ha seleccionado el item radio simple", Toast.LENGTH_SHORT).show();
    }
    public void capturarSeleccionadoitemsimple(String dato) {
        Toast.makeText(this, "Se ha seleccionado el item simple", Toast.LENGTH_SHORT).show();
    }
    public void accionAceptar() {
        mensajePersonalizado("Enviando Datos");
    }

    public void accionCancelar() {
        mensajePersonalizado("Cancelando Envio");
    }

    public void mensajePersonalizado(String opcion) {
        Toast mensaje = new Toast(getApplicationContext());

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.capa_toast,
                (ViewGroup) findViewById(R.id.lytLayout));

        TextView txtMsg = (TextView)layout.findViewById(R.id.txtMensaje);
        txtMsg.setText(opcion);

        mensaje.setDuration(Toast.LENGTH_SHORT);
        mensaje.setView(layout);
        mensaje.show();
    }

}