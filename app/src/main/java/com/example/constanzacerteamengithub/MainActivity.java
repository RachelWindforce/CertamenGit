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

    //Spinner sexo;
    EditText peso, estatura;
    Button calcular;
    TextView imc, mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sexo = findViewById(R.id.BoxSexo);
        peso = findViewById(R.id.txtPeso);
        estatura = findViewById(R.id.txtEstatura);
        calcular = findViewById(R.id.btnCalcular);
        imc = findViewById(R.id.textImc);
        mensaje = findViewById(R.id.mensajito);
    }

    public void CalcularImc (View view){

        String Pesso = peso.getText().toString();
        String Esttatura = estatura.getText().toString();


        if (Pesso.isEmpty() || Esttatura.isEmpty() ){
            Toast.makeText(this, "Porfavor complete todos los campos", Toast.LENGTH_SHORT).show();

        }else{

            Double Estatura = Double.parseDouble(Esttatura)/100.0;
            Double Peso = Double.parseDouble(Pesso);
            Double IMC = Peso/(Estatura*Estatura);
            imc.setText(IMC.toString().substring(0,5));

            if (IMC > 25 ){
                mensaje.setText("Como reducir el IMC:  \n 1)Haga 30 minutos de ejercicio aeróbico 5 veces por semana. " +
                        "\n 2)Logre un equilibrio entre el consumo de calorías y la actividad física. " +
                        "\n 3)Limite las grasas saturadas a no mas del 7% de las calorias totales " +
                        "\n 4)Tenga una alimentacion baja en colesterol con carnes magras, frutas,verduras y cereales integrales. ");


            } else if (IMC < 18.5) {
                mensaje.setText("Como aumentar el IMC: \n 1) Come con mas frecuencia. Empieza poco a poco a hacer 5 a 6 comidas más pequeñas durante el dia" +
                        "\n 2) Elige alimentos con muchos nutrientes." +
                        "\n 3) Agrega aderezos." +
                        "\n 4) Prueba licuados y batidos de frutas." +
                        "\n 5) Controla que bebes y cuando." +
                        "\n 6) Haz ejercicio.");

            }else{
                mensaje.setText("FELICITACIONES ud mantiene una exelente alimentacion");

            }

        }





    }
}