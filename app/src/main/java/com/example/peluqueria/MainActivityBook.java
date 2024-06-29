package com.example.peluqueria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.peluqueria.R;

public class MainActivityBook extends AppCompatActivity {
    ImageButton btn_home;
    ImageButton btn_books;
    ImageButton btn_user;
    ImageButton btn_history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_book);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.book_page), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //BOTONERA ---------------------------------------------------
        btn_home = findViewById(R.id.button_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityBook.this, MainActivityHome.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_books = findViewById(R.id.button_books);
        btn_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityBook.this, MainActivityBook.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_user = findViewById(R.id.button_user);
        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityBook.this, MainActivityUser.class);
                startActivities(new Intent[]{intent});
            }
        });

        btn_history = findViewById(R.id.button_history);
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityBook.this, MainActivityHistory.class);
                startActivities(new Intent[]{intent});
            }
        });

//FIN BOTONERA ---------------------------------------------

    }
}