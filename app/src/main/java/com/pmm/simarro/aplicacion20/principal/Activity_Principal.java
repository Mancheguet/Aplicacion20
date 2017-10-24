package com.pmm.simarro.aplicacion20.principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pmm.simarro.aplicacion20.R;
import com.pmm.simarro.aplicacion20.fragment.Activity_Fragment_Detalle;
import com.pmm.simarro.aplicacion20.fragment.Activity_Fragment_Lista;
import com.pmm.simarro.aplicacion20.fragment.CorreosListener;
import com.pmm.simarro.aplicacion20.pojo.Correo;

//Implementamos la interface creada
public class Activity_Principal extends AppCompatActivity implements CorreosListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal);

        //posicionar el fragment dentro de esta actividad
        Activity_Fragment_Lista frgListado =  (Activity_Fragment_Lista)getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        //Poner el listener para que escuche a ver si pasa alguna cosa
        frgListado.setCorreosListener(this);

    }

    @Override
    public void onCorreoSeleccionado(Correo correo) {

        //Miramos si existe el fragment o no
        boolean hayDetalle = (getSupportFragmentManager()).findFragmentById(R.id.FrgDetalle) != null ;
        //si ahy fragment , se ejecutará la parte de fragment , sino (else) cabmiará de activity para mostrarlo
        if (hayDetalle){
            //Para accedir al metodo mostrar detalle
            //RECORDAR SIEMRPE LOS DOS PARENTESIS !!!! SINO EL METODO NUESTRO DARÁ ERROR !!!!
            ((Activity_Fragment_Detalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDetalle(correo.toString());
        } else {
            Intent intent = new Intent(Activity_Principal.this , Activity_Detalle.class);
            intent.putExtra("correo", correo);
            startActivity(intent);
        }

    }
}
