package com.example.mvprpg.ui.personajes;

import android.os.Bundle;

import com.example.mvprpg.R;
import com.example.mvprpg.data.adapter.PersonajesAdapter;

public class ListActivity extends android.app.ListActivity {

    private PersonajesAdapter adapterPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        adapterPersonajes = new PersonajesAdapter(this);
        getListView().setAdapter(adapterPersonajes);

    }
}
