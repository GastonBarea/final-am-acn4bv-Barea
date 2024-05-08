package com.example.peluquera;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
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
                Intent intent = new Intent(MainActivityHome.this,MainActivityUser.class);//a donde va
                startActivities(new Intent[]{intent});
            }
        });

        //Creo el objeto de texto
        TextView myText = new TextView(this);
        myText.setText("Hola");



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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_menu, menu);
        return true;
    }


}
