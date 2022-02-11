package sv.edu.udb.discusion_de_resultados2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView txtNombre;
    private TextView txtSalarioNeto;
    private TextView txtSalarioTotal;
    private TextView txtHorasTrabajadas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNombre=(TextView) findViewById(R.id.txtNombreResultado);
        txtSalarioNeto=(TextView) findViewById(R.id.txtSalarioNeto);
        txtSalarioTotal=(TextView) findViewById(R.id.txtSalarioTotal);
        txtHorasTrabajadas=(TextView) findViewById(R.id.txtHorasTrabajo);


        Bundle bundle = getIntent().getExtras();
        String nombreTrabajador = bundle.getString("txtNombre");
        String salarioRTotal=bundle.getString("salarioTotal");
        String salarioRNeto=bundle.getString("salarioNeto");
        String horasTrabajo=bundle.getString("txtHoras");

        txtNombre.setText("Trabajador: " + nombreTrabajador);
        txtHorasTrabajadas.setText("Trabajo un total de: " + horasTrabajo + " Horas");
        txtSalarioTotal.setText("El Salario sin deducciones es: $" + salarioRTotal);
        txtSalarioNeto.setText("El salario con deducciones es: $" +salarioRNeto);

    }

    public void finalizar(View v)
    {
        finish();
    }


}