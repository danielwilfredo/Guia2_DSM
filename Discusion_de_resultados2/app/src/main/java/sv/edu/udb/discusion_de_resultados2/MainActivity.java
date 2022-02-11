package sv.edu.udb.discusion_de_resultados2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText txtNombre;
    private EditText txtHoras;
    private Button btnCalcular;
    double precioHora = 8.50;
    double iss =0.02;
    double afp = 0.03;
    double renta=0.04;
    double salarioTotal, salarioNeto, deducciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre= (EditText) findViewById(R.id.txtNombre);
        txtHoras=(EditText) findViewById(R.id.txtHoras);
         }


         public void calcular(View v)
         {
             String nombre=txtNombre.getText().toString();
             String valorHoras=txtHoras.getText().toString();

             int hora=Integer.parseInt(valorHoras);

            salarioTotal=precioHora*hora;
            deducciones = (salarioTotal*iss)+(salarioTotal*afp)+(salarioTotal*renta);
            salarioNeto=salarioTotal-deducciones;
             Intent i=new Intent(this, MainActivity2.class);
             i.putExtra("txtNombre", txtNombre.getText().toString());
             i.putExtra("salarioTotal",String.valueOf(salarioTotal));
             i.putExtra("salarioNeto", String.valueOf(salarioNeto));
             i.putExtra("txtHoras", txtHoras.getText().toString());

             startActivity(i);
         }
}