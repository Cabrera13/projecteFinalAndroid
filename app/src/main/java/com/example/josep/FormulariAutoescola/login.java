package com.example.josep.FormulariAutoescola;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    final Context context = this;
    Button buttonLogin;
    Button buttonEnrere;
    EditText editTextNom;
    EditText editTextContrasenya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final SingletonProject instancia = SingletonProject.getInstance();
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonEnrere = (Button) findViewById(R.id.ButtonEnrere);
        editTextNom = (EditText) findViewById(R.id.editText);
        editTextContrasenya = (EditText) findViewById(R.id.editText4);

        instancia.setPosicio(-1);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNom.getText().toString().equals("1234") && editTextContrasenya.getText().toString().equals("1234")) {
                    instancia.setLogin(true);
                    Intent i = new Intent(login.this, Formulari.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Toast toast = Toast.makeText(context, "Contrasenya o nom incorrectes!", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
        buttonEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this,Formulari.class);
                startActivity(i);
                finish();
            }
        });

    }
}
