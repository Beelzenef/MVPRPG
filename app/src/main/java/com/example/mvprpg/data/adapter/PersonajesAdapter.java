package com.example.mvprpg.data.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mvprpg.R;
import com.example.mvprpg.data.pojo.Personaje;
import com.example.mvprpg.data.repo.PersonajeRepository;
import com.github.ivbaranov.mli.MaterialLetterIcon;

import org.w3c.dom.Text;

/**
 * Adapter para personajes
 */

public class PersonajesAdapter extends ArrayAdapter<Personaje> {


    public PersonajesAdapter(@NonNull Context context) {
        super(context, R.layout.list_item_personajes, PersonajeRepository.getInstance().getPersonajes());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        PersonajeHolder personajeHolder;
        View v = convertView;

        if (v == null)
        {
            LayoutInflater inflador = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            v = inflador.inflate(R.layout.list_item_personajes, null);

            personajeHolder = new PersonajeHolder();

            personajeHolder.txtV_Nombre = (TextView) v.findViewById(R.id.txtV_NombrePJ);
            personajeHolder.txtV_Clase = (TextView) v.findViewById(R.id.txtV_ClasePJ);
            personajeHolder.txtV_Nivel = (TextView) v.findViewById(R.id.txtV_NivelPJ);

            v.setTag(personajeHolder);
        }
        else
        {
            personajeHolder = (PersonajeHolder) v.getTag();
        }

        personajeHolder.icono.setLetter(getItem(position).getNombre().substring(0,1));
        personajeHolder.txtV_Clase.setText(getItem(position).getClase());
        personajeHolder.txtV_Nivel.setText(getItem(position).getNivel());
        personajeHolder.txtV_Nombre.setText(getItem(position).getNombre());

        return v;
    }

    class PersonajeHolder {
        MaterialLetterIcon icono;
        TextView txtV_Nombre;
        TextView txtV_Clase;
        TextView txtV_Nivel;
    }
}
