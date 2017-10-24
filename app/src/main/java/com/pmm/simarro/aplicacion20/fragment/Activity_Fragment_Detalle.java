package com.pmm.simarro.aplicacion20.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pmm.simarro.aplicacion20.R;

public class Activity_Fragment_Detalle extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_activity_fragment_detalle, container, false);
    }

    public void mostrarDetalle(String texto){
        TextView txtDetalle = (TextView)getView().findViewById(R.id.TxtDetalle);
        txtDetalle.setText(texto);
    }

}
