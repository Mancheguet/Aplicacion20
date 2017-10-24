package com.pmm.simarro.aplicacion20.Adaptador;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pmm.simarro.aplicacion20.R;
import com.pmm.simarro.aplicacion20.pojo.Correo;

import java.util.ArrayList;

/**
 * Created by Javi on 23/10/17.
 */

public class AdaptadorCorreos extends ArrayAdapter<Correo> {

    Activity context; //Aqui recogemos en quina activity estamos para luego pasarle el contexto
    ArrayList<Correo> datos;

    public AdaptadorCorreos(Fragment context, ArrayList<Correo> datos) {
        super(context.getActivity(), R.layout.layout_elemento_lista, datos);
        this.context = context.getActivity();
        this.datos = datos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.layout_elemento_lista, null);
        //per agafar De:
        TextView lblDe = (TextView) item.findViewById(R.id.LblDe);
        lblDe.setText(datos.get(position).getDe());
        //Per agafar el Asunto:
        TextView lblAsunto = (TextView) item.findViewById(R.id.LblAsunto);
        lblAsunto.setText(datos.get(position).getAsunto());

        return (item);

    }
}
