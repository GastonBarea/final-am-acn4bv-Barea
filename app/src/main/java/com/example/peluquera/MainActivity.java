package com.example.peluquera;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.bottom_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.home){
            Intent intent1 = new Intent(this, MainActivityHome.class);
            startActivity(intent1);
            return true;
        } else if (id == R.id.book) {
            Intent intent2 = new Intent(this, MainActivityBook.class);
            startActivity(intent2);
            return true;
        }else if (id == R.id.user) {
            Intent intent3 = new Intent(this, MainActivityUser.class);
            startActivity(intent3);
            return true;
        }else if (id == R.id.history) {
            Intent intent4 = new Intent(this, MainActivityHistory.class);
            startActivity(intent4);
            return true;
        }else {
            return super.onOptionsItemSelected(item);
        }

    }


    public void aReserva (View view){
        Log.i("boton_NuevaReserva", "Ganaste");
    }


    //clase 3/04  1:11:43 / 1:45:02   https://drive.google.com/file/d/1bNFe0ohDpoUFRaQDyaiFaBycOYcGOPly/view

}