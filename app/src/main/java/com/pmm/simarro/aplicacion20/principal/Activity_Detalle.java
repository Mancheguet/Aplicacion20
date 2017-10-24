package com.pmm.simarro.aplicacion20.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pmm.simarro.aplicacion20.R;
import com.pmm.simarro.aplicacion20.fragment.Activity_Fragment_Detalle;
import com.pmm.simarro.aplicacion20.fragment.CorreosListener;
import com.pmm.simarro.aplicacion20.pojo.Correo;

public class Activity_Detalle extends AppCompatActivity{

    Correo correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

        correo = (Correo) getIntent().getSerializableExtra("correo");
        Activity_Fragment_Detalle frgDetalle = (Activity_Fragment_Detalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
        frgDetalle.mostrarDetalle(correo.toString());

    }
}
