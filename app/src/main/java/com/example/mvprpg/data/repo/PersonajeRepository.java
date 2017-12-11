package com.example.mvprpg.data.repo;

import com.example.mvprpg.data.pojo.Personaje;

import java.util.ArrayList;

/**
 * Repositorio de personajes
 */

public class PersonajeRepository {

    private ArrayList<Personaje> listaPersonajes;
    private static PersonajeRepository personajeRepository;

    static {
        personajeRepository = new PersonajeRepository();
    }

    private PersonajeRepository()
    {
        listaPersonajes = new ArrayList<>();
        initPersonajes();
    }

    public static PersonajeRepository getInstance() {
        return personajeRepository;
    }

    public ArrayList<Personaje> getPersonajes() {
        return listaPersonajes;
    }

    public void addPersonaje(Personaje p) {
        listaPersonajes.add(p);
    }

    private void initPersonajes() {
        addPersonaje(new Personaje("Ethan Thross", "Guerrero", 14));
        addPersonaje(new Personaje("Dasha Neisser", "Asesina", 15));
    }

}
