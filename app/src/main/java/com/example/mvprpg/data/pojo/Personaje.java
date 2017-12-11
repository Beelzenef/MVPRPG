package com.example.mvprpg.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Clase POJO - Personaje
 */

public class Personaje implements Parcelable, Comparable {

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

    protected Personaje(Parcel in)
    {
        this.nombre = in.readString();
        this.clase = in.readString();
        this.nivel = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(clase);
        dest.writeInt(nivel);
    }

    public final static Creator<Personaje> CREATOR = new Creator<Personaje>() {
        @Override
        public Personaje createFromParcel(Parcel source) {
            return new Personaje(source);
        }

        @Override
        public Personaje[] newArray(int size) {
            return new Personaje[0];
        }
    };

    @Override
    public int compareTo(@NonNull Object o) {
        return nombre.compareTo(((Personaje)o).getNombre());
    }
}
