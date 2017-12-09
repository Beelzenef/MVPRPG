package com.example.mvprpg.data.pojo;

/**
 * Clase POJO - Personaje
 */

public class Personaje {

    private String nombre;
    private String clase;
    private int nivel;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getClase() {
        return this.clase;
    }

    public void setClase(String c) {
        this.clase = c;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int n) {
        this.nivel = n;
    }

    public Personaje(String n, String c, int l) {
        this.nombre = n;
        this.clase = c;
        this.nivel = l;
    }
}
