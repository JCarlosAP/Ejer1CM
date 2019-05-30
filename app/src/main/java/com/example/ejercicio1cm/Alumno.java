package com.example.ejercicio1cm;

import android.content.Context;

import com.example.ejercicio1cm.R;

public class Alumno {
    private long id;
    private String nombre;
    private String ap;
    private String am;
    private String edad;
    private String genero;
    private String rfc;
    private String signo;
    private Context contexto;

    public Alumno(long id, String nombre, String ap,String am,String edad,String genero,String rfc,String signo,Context contexto) {
        this.id = id;
        this.nombre = nombre;
        this.ap = ap;
        this.am =am;
        this.edad = edad;
        this.genero = genero;
        this.rfc = rfc;
        this.signo=signo;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getap() {
        return ap;
    }
    public void setap(String ap) {
        this.ap = ap;
    }

    public String getam() {
        return am;
    }
    public void setam(String am){
        this.am = am;
    }

    public String getgenero() {
        return genero;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }

    public String getedad() {
        return edad;
    }
    public void setedad(String edad){
        this.edad = edad;
    }

    public Context getContexto() {
        return contexto;
    }

    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }

    public String getrfc() {
        return rfc;
    }

    public void setrfc(String rfc) {
        this.rfc = rfc;
    }

    public String getsignoo() {
        return signo;
    }

    public void setsigno(String signo) {
        this.signo = signo;
    }

    @Override
    public String toString() {
        return contexto.getResources().getString(R.string.texto_nombre)
                + getNombre();
    }
}
