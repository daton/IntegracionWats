package oscar.org.integracionwats;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Vibrator vibrador= (Vibrator) getSystemService(VIBRATOR_SERVICE);
        vibrador.vibrate(3000);
        // Aqui implementaremos la navegacion
        //Vamos a encontrar el boton por su id
        findViewById(R.id.boton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Antes de navegar ponemos un mensajito de prueba de tipo Toast
  Toast.makeText(getApplicationContext(),"Veamos si funciona", Toast.LENGTH_LONG).show();
               //Ya que funciono ponemos la navegacion
          Intent hola=new Intent(getApplicationContext(),ActivityWhats.class);
                startActivity(hola);
            }
        });
    }
}
