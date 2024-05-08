package com.example.peluquera;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home: // Aquí es donde se usa R.id.home como una constante
                        Toast.makeText(MainActivity.this, "Home seleccionado", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.book:
                        Toast.makeText(MainActivity.this, "Book seleccionado", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.user:
                        Toast.makeText(MainActivity.this, "User seleccionado", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.history:
                        Toast.makeText(MainActivity.this, "History seleccionado", Toast.LENGTH_SHORT).show();
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

    public void aReserva(View view){
        Log.i("boton_NuevaReserva", "Ganaste");
    }
}
