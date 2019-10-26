package com.example.ejercicio2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VistaDatosActivity extends AppCompatActivity {
    TextView tvDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_datos);

        tvDatos = findViewById(R.id.tvDatosNombre);
        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");
        tvDatos.setText("BIENVENIDO:"+ nombre);
    }
}
