package com.example.peluquera;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivityHome extends AppCompatActivity {

    Button btn_nuevaReserva;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.menu), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//Creando botón para ir a buscar reservas
        btn_nuevaReserva = findViewById(R.id.boton_NuevaReserva);
        btn_nuevaReserva.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this,MainActivityBuscar.class);
                startActivities(new Intent[]{intent});
            }
        });



        // TODO: feat: hacer los CardView dinámicos

        LinearLayout liner = findViewById(R.id.CardViewLinerLayout);
        CardView cardView_lacita = new CardView(this);
        liner.addView(cardView_lacita);
        TextView texto1 = new TextView(this);
        TextView texto2 = new TextView(this);
        texto1.setText("GASTON BAREA");
        texto2.setText("1133654477");
        cardView_lacita.addView(texto1);
        cardView_lacita.addView(texto2);
        // TODO: feat: aca hay que cargar el nombre de usuario cuando se registre

        TextView nombre_usuario = findViewById(R.id.nombre_usuario);
        nombre_usuario.setText("Juan Pepe");

        TextView telefono_usuario = findViewById(R.id.telefono_usuario);
        telefono_usuario.setText("11 2235 5544");


// TODO: feat: ver configurar barra de navegación
//Intentando crear la barra de navegación
        /*bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Toast.makeText(MainActivityHome.this, "Home seleccionado", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.book:
                        Toast.makeText(MainActivityHome.this, "Book seleccionado", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.user:
                        Toast.makeText(MainActivityHome.this, "User seleccionado", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.history:
                        Toast.makeText(MainActivityHome.this, "History seleccionado", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });*/

    }

// TODO: feat eliminar cita

    public void eliminarCita (View view){
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_menu, menu);
        return true;
    }

}
