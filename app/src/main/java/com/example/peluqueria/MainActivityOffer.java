package com.example.peluqueria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.peluqueria.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivityOffer extends AppCompatActivity {

    ImageButton btn_home;
    ImageButton btn_books;
    ImageButton btn_user;
    ImageButton btn_history;
    List<ListPeluquerias> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_offer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.offer), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();

        //BOTONERA ---------------------------------------------------
        btn_home = findViewById(R.id.button_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityOffer.this, MainActivityHome.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_books = findViewById(R.id.button_books);
        btn_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityOffer.this, MainActivityBook.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_user = findViewById(R.id.button_user);
        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityOffer.this, MainActivityUser.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_history = findViewById(R.id.button_history);
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityOffer.this, MainActivityHistory.class);
                startActivities(new Intent[]{intent});
            }
        });

//FIN BOTONERA ---------------------------------------------

    }
    public  void init() {
        elements = new ArrayList<>();
        elements.add(new ListPeluquerias("@+id/iconImageView","Al Corte","Horarios: L a V de 08 a 20Hs.","Corte, Tintura, Manos", "Bermudez 1234, CABA", "1136558877","alcorte@gmail.com"));
        elements.add(new ListPeluquerias("@+id/iconImageView","Las Tijeras","Horarios: L a V de 09 a 21Hs.","Corte, Tintura, Pies", "Jonte 5487, CABA", "1155447788","lastijeras@gmail.com"));
        elements.add(new ListPeluquerias("@+id/iconImageView","Javier","Horarios: L a V de 09 a 20Hs.","Corte, Alisado, Tintura", "Av. Nazca 0546, CABA", "1154871245","javier@hotail.com.ar"));
        elements.add(new ListPeluquerias("@+id/iconImageView","Lo De Lalo","Horarios: L a V de 08 a 19Hs.","Corte, Tintura, Manos", "Segurola 4487, CABA", "1155489888","lalo@gmail.com"));
        elements.add(new ListPeluquerias("@+id/iconImageView","La Sin Pelo","Horarios: L a V de 07 a 20Hs.","Corte, Alisado, Manos", "Bermudez 1278, CABA", "1159887788","Sinpelo@gmail.com"));
        elements.add(new ListPeluquerias("@+id/iconImageView","Calandria","Horarios: L a V de 10 a 20Hs.","Corte, Tintura, Manos", "Segurola 3354, CABA", "1136558899","calandria@yahoo.com"));
        elements.add(new ListPeluquerias("@+id/iconImageView","Esteticarp","Horarios: L a V de 09 a 21Hs.","Corte, Tintura, Manos", "Chivilcoy 5486, CABA", "1154889966","Esteticarp@gmail.com"));
        elements.add(new ListPeluquerias("@+id/iconImageView","Las Hermanas","Horarios: L a V de 10 a 22Hs.","Corte, Tintura, Pies", "Cuenca 1248, CABA", "1154887799","L_Hermanas@yahoo.com.ar"));
        elements.add(new ListPeluquerias("@+id/iconImageView","Gustavo Manchas","Horarios: L a V de 10 a 22Hs.","Corte, Pies, Manos", "Cuenca 6699, CABA", "1178889655","GusManchas@gmail.com"));
        elements.add(new ListPeluquerias("@+id/iconImageView","La Bella","Horarios: L a V de 08 a 20Hs.","Corte, Tintura, Manos", "Bermudez 1133, CABA", "1154871499","La_Bella@gmail.com"));


        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}
