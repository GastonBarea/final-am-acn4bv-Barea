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

        final CardView cardView1 = (CardView) findViewById(R.id.CardView1);


        CardView cardView2 = new CardView(this);
        cardView2.layout(12,12,12,12);
        //cardView2.addView();



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

        TextView nombre_usuario = findViewById(R.id.nombre_usuario);
        nombre_usuario.setText("Juan Pepe");

        TextView telefono_usuario = findViewById(R.id.telefono_usuario);
        telefono_usuario.setText("11 2235 5544");

    }

// TODO: feat eliminar cita

        ImageButton buttonX = findViewById(R.id.cancelar_cita);
        public void eliminarX(View view){


        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_menu, menu);
        return true;
    }

}
