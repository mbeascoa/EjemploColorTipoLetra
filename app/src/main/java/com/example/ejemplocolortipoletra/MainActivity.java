package com.example.ejemplocolortipoletra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2;
    private RadioButton r1,r2,r3,r4;
    private RadioGroup rg1,rg2;
    private EditText resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.lblColor);
        tv2=(TextView)findViewById((R.id.lblTipo));
        this.resultado = (EditText) findViewById(R.id.txtMensaje1);

        r1=(RadioButton)findViewById(R.id.rdbRojo);
        r2=(RadioButton)findViewById(R.id.rdbAzul);
        r3=(RadioButton)findViewById((R.id.rdbMayuscula));
        r4=(RadioButton)findViewById(R.id.rdbMinuscula);

        rg1=(RadioGroup)findViewById(R.id.rdgGroup1);
        rg2=(RadioGroup)findViewById(R.id.rdgGroup2);

        //Seleccionar por defecto el radio Rojo y el radio mayusculas
        rg1.check(R.id.rdbRojo);
        rg2.check(R.id.rdbMayuscula);

    }

    public void mostrarColorTipo(View view) {

        int radioseleccionadoColor=rg1.getCheckedRadioButtonId();
        String nombre = "Eres un crack chaval";

        switch (radioseleccionadoColor) {
            case R.id.rdbRojo:
                //tv1.setTextColor(getResources().getColor( R.color.rojo));
                this.resultado.setTextColor(ContextCompat.getColor(this, R.color.mikelrojo));
                break;
            case R.id.rdbAzul:
                //this.resultado.setTextColor(Color.BLUE);
                this.resultado.setTextColor(ContextCompat.getColor(this, R.color.mikelazul));
                break;
            default:
                break;
        }
        int radioseleccionadoTipo =rg2.getCheckedRadioButtonId();
        switch (radioseleccionadoTipo) {
            case R.id.rdbMayuscula:
                nombre = nombre.toUpperCase();
                this.resultado.setText(nombre);
                break;
            case R.id.rdbMinuscula:
                nombre = nombre.toLowerCase();
                this.resultado.setText(nombre);
                break;
            default:
                nombre = "Error en la selección";
                this.resultado.setText(nombre);
                break;
        }

    }


}