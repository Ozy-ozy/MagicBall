package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView bola;
    private TextView texto;
    private String [] respuesta = {"No lo creo", "Deberias intentar denuevo", "Probablemente", "Por favor, no", "Ve a tomar agua", "Ya tomaste agua?",
            "Tu decision no deberia depender de lo que yo diga", "Creo que necesitas ayuda", "Sí", "Cuantos años tienes para seguir insistiendo aca?", "Consulta con tus padres", "No vuelvas",
            "Mejor no decirte ahora", "Yo no predigo el futuro", "El destino no existe, te engañe", "No cuentes con eso", "Busca en youtube, todo esta alli", "Lamentablemente no soy google",
            "No", "Mis fuentes dicen que no", "Deberias cerrar tu cuenta de facebook", "Eres rar@", "No te cansas?", "Me rindo","Me aburres", "No tienes otra cosa que hacer?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bola = findViewById(R.id.b1);

        texto = findViewById(R.id.textorespuesta);

        bola.setOnClickListener(this);


        Toast.makeText(MainActivity.this,"Bienvenido!!!", Toast.LENGTH_SHORT).show();


    }


    @Override
    public void onClick (View v){

        switch (v.getId()){

            case R.id.b1:
            int rand = new Random().nextInt(respuesta.length);
            texto.setText(respuesta[rand]);
            break;

        }


    }
    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(this, "Te extrañaba.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause(){
        super.onPause();
        Toast.makeText(this,"Vuelve porfavor!!!!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop(){
        super.onStop();
        Toast.makeText(this, "Yo te queria, pero veo que no era reciproco...", Toast.LENGTH_SHORT).show();
    }
}
