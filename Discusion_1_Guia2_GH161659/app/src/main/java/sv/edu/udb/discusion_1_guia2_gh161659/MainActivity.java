package sv.edu.udb.discusion_1_guia2_gh161659;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResultado;
    private Button btnSumar;
    int contador =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResultado=findViewById(R.id.txtResultado);
        btnSumar=findViewById(R.id.btnSumar);

        if(savedInstanceState!=null)
        {
            contador=savedInstanceState.getInt("Contador");
            txtResultado.setText(String.valueOf(contador));
        }

    }

    @Override
     protected void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Contador", contador);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        contador=savedInstanceState.getInt("Contador");
        txtResultado.setText(String.valueOf(contador));

    }

    public void sumarUno(View view)
    {
       contador++;
        if (contador>9)
        {
           contador=0;
           txtResultado.setText("0");
        }
        String resultado = String.valueOf(contador);
        txtResultado.setText(resultado);
    }

}