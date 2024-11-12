package com.example.constanzacerteamengithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sexo;
    EditText peso, estatura;
    Button calcular;
    TextView imc, mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sexo = findViewById(R.id.BoxSexo);
        peso = findViewById(R.id.txtPeso);
        estatura = findViewById(R.id.txtEstatura);
        calcular = findViewById(R.id.btnCalcular);
        imc = findViewById(R.id.textImc);
        mensaje = findViewById(R.id.mensajito);
    }

    public void CalcularImc (View view){

        String Pesso = peso.getText().toString();
        String Esttatura = estatura.getText().toString();
        String Mensaje = mensaje.getText().toString();

        if (Pesso.isEmpty() || Esttatura.isEmpty() ){
            Toast.makeText(this, "Porfavor complete todos los campos", Toast.LENGTH_SHORT).show();

        }else{

            Double Peso = Double.parseDouble(String.valueOf(peso))/100;
            Double Estatura = Double.parseDouble(String.valueOf(estatura));
            Double IMC = Peso/(Estatura*Estatura);

        }





    }
}