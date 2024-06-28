package com.example.peluqueria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivityHome extends AppCompatActivity {

    ImageButton btn_home;
    ImageButton btn_books;
    ImageButton btn_user;
    ImageButton btn_history;
    Button btn_nuevaReserva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);/*GENERA PANTALLA COMPLETA*/
        setContentView(R.layout.activity_main_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home_page), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//Boton "Nueva Reserva" ---------------------------------------------------
        btn_nuevaReserva = findViewById(R.id.boton_NuevaReserva);
        btn_nuevaReserva.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this, MainActivityOffer.class);
                startActivities(new Intent[]{intent});
            }
        });

//BOTONERA ---------------------------------------------------
        btn_home = findViewById(R.id.button_home);
        btn_home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this, MainActivityHome.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_books = findViewById(R.id.button_books);
        btn_books.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this, MainActivityBook.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_user = findViewById(R.id.button_user);
        btn_user.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this, MainActivityUser.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_history = findViewById(R.id.button_history);
        btn_history.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this, MainActivityHistory.class);
                startActivities(new Intent[]{intent});
            }
        });

//FIN BOTONERA ---------------------------------------------


        // TODO: feat: hacer los CardView dinámicos - prueba 1

        LinearLayout liner = findViewById(R.id.CardViewLinerLayout);
        CardView cardView_lacita = new CardView(this);
        liner.addView(cardView_lacita);
        TextView texto1 = new TextView(this);
        TextView texto2 = new TextView(this);
        texto1.setText("GASTON BAREA");
        texto2.setText("1133654477");
        cardView_lacita.addView(texto1);
        cardView_lacita.addView(texto2);

        // TODO: feat: aca hay que cargar el nombre de usuario cuando se registre - prueba 2

        TextView nombre_usuario = findViewById(R.id.nombre_usuario);
        nombre_usuario.setText("Juan Pepe");
        TextView telefono_usuario = findViewById(R.id.telefono_usuario);
        telefono_usuario.setText("11 2235 5544");



    }

// TODO: feat eliminar cita

    public void eliminarCita (View view){/*Escucha el metodo creado en el xml*/

        TextView cardView_nombre_peluqueria = findViewById(R.id.cardView_nombre_peluqueria);
        cardView_nombre_peluqueria.setText("");

        TextView cardView_fecha_horario_cita = findViewById(R.id.cardView_fecha_horario_cita);
        cardView_fecha_horario_cita.setText("");

        TextView cardView_servicio_tipo = findViewById(R.id.cardView_servicio_tipo);
        cardView_servicio_tipo.setText("");

        TextView cardView_direccion_peluqueria = findViewById(R.id.cardView_direccion_peluqueria);
        cardView_direccion_peluqueria.setText("");

        TextView cardView_telefono_peluqueria = findViewById(R.id.cardView_telefono_peluqueria);
        cardView_telefono_peluqueria.setText("");
    }


}
