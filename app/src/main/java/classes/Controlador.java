package classes;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import java.time.Instant;

public class Controlador {

    public Controlador(){}

    public void mostrarMensagem (String titulo, String texto, Context context){
        new AlertDialog.Builder(context)
                .setTitle(titulo)
                .setMessage(texto)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //fecha caixa de dialogo
                        dialog.dismiss();
                    }
                }).show();
    }
}
