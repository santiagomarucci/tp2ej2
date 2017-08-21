package com.aplicacionesmoviles.tp2ej2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.numero1);
        num2=(EditText)findViewById(R.id.numero2);
        resultado=(TextView)findViewById(R.id.textView3);

    }


    public void sumar(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        int suma=n1+n2;
        resultado.setText(""+suma);


    }
    public void resta(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        int resta=n1-n2;
        resultado.setText(""+resta);


    }
    public void multiplicar(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        int multiplicar=n1*n2;
        resultado.setText(""+multiplicar);

    }
    public void division(View view){
        int n1=Integer.valueOf(num1.getText().toString());
        int n2=Integer.valueOf(num2.getText().toString());
        if (n2==0) {
            Toast toast;
            toast = Toast.makeText(this, "no se puede dividir por 0", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            int division = n1 + n2;
            resultado.setText("" + division);
        }

    }

}
