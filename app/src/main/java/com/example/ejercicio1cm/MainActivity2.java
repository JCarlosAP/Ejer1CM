package com.example.ejercicio1cm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.ejercicio1cm.Alumno;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity{
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    Adaptador adaptador;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String dato1 = getIntent().getStringExtra("Nombre_del_Alumno");
        String dato2 = getIntent().getStringExtra("Apellido_Paterno");
        String dato3 = getIntent().getStringExtra("Apellido_Materno");
        String dato4 = getIntent().getStringExtra("Edad");
        String dato5 = getIntent().getStringExtra("Genero (M/F)");
        String dato6 = getIntent().getStringExtra("RFC");
        String dato7 = getIntent().getStringExtra("Horoscopo");
        String dato8 = "años";

        Alumno tmpAlumno = new Alumno(1,dato1,dato2 ,dato3,dato4 +dato8,dato5,dato6,dato7, this);
        alumnos.add(tmpAlumno);

        adaptador = new Adaptador(this,alumnos);

        lv = findViewById(R.id.lv);

        lv.setAdapter(adaptador);


    }
}
