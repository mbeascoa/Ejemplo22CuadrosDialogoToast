package com.example.ejemplo22;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;


    public class DialogoSeleccionRadio extends DialogFragment {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            final String[] elementos = {"Permiso Vacacional", "Ausencia", "Traslado de Domicilio"};

            return new AlertDialog.Builder(getActivity())
                    .setIcon(R.drawable.android)
                    .setTitle("SUCURSAL")
                    .setSingleChoiceItems(elementos, -1,new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int item) {
                            String datoseleccionado = elementos[item];
                        }
                    })
                    .create();
        }
    }

