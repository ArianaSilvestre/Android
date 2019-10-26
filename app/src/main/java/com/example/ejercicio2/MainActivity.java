package com.example.ejercicio2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etPass;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        etPass = findViewById(R.id.etPass);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = etNombre.getText().toString();
                String password = etPass.getText().toString();

                if (nombre.equals("ariana") && password.equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, VistaDatosActivity.class);
                    intent.putExtra("nombre",nombre);
                    Toast.makeText(getApplicationContext(),"Usuario correcto", Toast.LENGTH_SHORT).show();

                    startActivity(intent);
                }else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
