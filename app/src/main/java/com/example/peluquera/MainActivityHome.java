package com.example.peluquera;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        btn_nuevaReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this,MainActivityBuscar.class);
                startActivities(new Intent[]{intent});
            }
        });

        // TODO: feat: hacer los CardView dinámicos

        CardView cardView1 = (CardView) new CardView(this);
        cardView1.layout(5,5,5,5);
        cardView1.setPaddingRelative(5,5,0,0);


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
        // TODO: feat: aca hay que cargar el nombre de usuario cuando se registre

        TextView mensaje_bienvenida = findViewById(R.id.bienvenidaUsuario);
        mensaje_bienvenida.setText(R.string.texto_bienvenidaUsuario);/*COMO CONCATENO UN TEXTO*/

        TextView nombre_usuario = findViewById(R.id.nombre_usuario);
        nombre_usuario.setText(R.string.nombre_usuario);

        TextView telefono_usuario = findViewById(R.id.telefono_usuario);
        telefono_usuario.setText(R.string.telefono_usuario);


        // TODO: feat: crear CardView con un metodo y eliminarlo con el botón cancelar_reserva


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_menu, menu);
        return true;
    }


}
