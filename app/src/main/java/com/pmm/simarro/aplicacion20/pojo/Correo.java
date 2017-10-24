package com.pmm.simarro.aplicacion20.pojo;

import java.io.Serializable;

/**
 * Created by Javi on 23/10/17.
 */

public class Correo implements Serializable{
    private String de;
    private String asunto;
    private String contenido;

    public Correo(String de, String asunto, String contenido) {
        this.de = de;
        this.asunto = asunto;
        this.contenido = contenido;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Correo :" + '\n' +
                "De : '" + de + '\n' +
                "Asunto : '" + asunto + '\n' +
                "Contenido : '" + contenido ;
    }
}
