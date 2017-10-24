package com.pmm.simarro.aplicacion20.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.pmm.simarro.aplicacion20.Adaptador.AdaptadorCorreos;
import com.pmm.simarro.aplicacion20.R;
import com.pmm.simarro.aplicacion20.pojo.Correo;

import java.util.ArrayList;

public class Activity_Fragment_Lista extends Fragment implements AdapterView.OnItemClickListener {

    private ArrayList<Correo> datos = new ArrayList<Correo>();
    private ListView lstListado;
    private CorreosListener listener;

    //Para lanzar el evento desde la activity
    public void setCorreosListener(CorreosListener listener){
        this.listener=listener;
    }

    //OnCreateView , Dónde se asocia el layout al Fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_activity_fragment_lista, container , false);

    }

    //OnActivityCreated, Entra en funcionamiento cuendo se ha completado el OnCreate del activity
    @Override
    public void onActivityCreated(@Nullable Bundle state) {
        super.onActivityCreated(state);
        lstListado = (ListView)getView().findViewById(R.id.listView);
        datos.add(new Correo("Persona 1", "Asunto del correo 1","texto del correo 1"));
        datos.add(new Correo("Persona 2", "Asunto del correo 2","texto del correo 2"));
        datos.add(new Correo("Persona 3", "Asunto del correo 3","texto del correo 3"));
        datos.add(new Correo("Persona 4", "Asunto del correo 4","texto del correo 4"));
        datos.add(new Correo("Persona 5", "Asunto del correo 5","texto del correo 5"));

        lstListado.setAdapter(new AdaptadorCorreos(this, datos));

        //Si el this esta en rojo , alt+enter y la segunda , para hacer el override de onItemClick
        lstListado.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

        if(listener != null){
            //cuando hacer clic en la lista , recoge la informacion del correo
            listener.onCorreoSeleccionado((Correo)lstListado.getAdapter().getItem(pos));
        }

    }
}
