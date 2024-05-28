package com.example.peluquera;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivityOffer extends AppCompatActivity {

    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_offer);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();

    }

    public  void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#D30000","Pedro", "Mexico", "Activo"));
        elements.add(new ListElement("#D30000","Juan", "Argentino", "Activo"));
        elements.add(new ListElement("#D30000","Lucas", "Argentino", "Activo"));
        elements.add(new ListElement("#D30000","Marcelo", "Argentino", "Activo"));
        elements.add(new ListElement("#D30000","Jose", "Mexico", "Inactivo"));
        elements.add(new ListElement("#D30000","Matias", "Colombiano", "Activo"));
        elements.add(new ListElement("#D30000","Pedro2", "Mexico", "Activo"));
        elements.add(new ListElement("#D30000","Juan2", "Argentino", "Activo"));
        elements.add(new ListElement("#D30000","Lucas2", "Argentino", "Activo"));
        elements.add(new ListElement("#D30000","Marcelo2", "Argentino", "Activo"));
        elements.add(new ListElement("#D30000","Jose2", "Mexico", "Inactivo"));
        elements.add(new ListElement("#D30000","Matias2", "Colombiano", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}
