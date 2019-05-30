package com.example.ejercicio1cm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOGTAG = "INFORMACIÓN";

    private Alumno Alumno;
    private EditText nombreAlu;
    private EditText apAlu;
    private EditText amAlu;
    private EditText geneAlu;
    private EditText dia;
    private EditText ano;
    private EditText horoscopo;
    private EditText edadAlu;
    private Button boton1;
    private TextView miBien;

    private static String[] spinmes={"01","02","03","04","05","06","07","08","09","10","11","12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        miBien = (TextView)findViewById(R.id.textBien);
        boton1 = findViewById(R.id.button1);

        nombreAlu = (EditText) findViewById(R.id.editNombre);
        apAlu = (EditText) findViewById(R.id.editAp);
        amAlu = (EditText) findViewById(R.id.editAm);
        geneAlu = (EditText) findViewById(R.id.editGenero);
        dia = (EditText) findViewById(R.id.editTextdia);
        ano = (EditText) findViewById(R.id.editTextano);

        ArrayAdapter adapter =  new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,spinmes);

        final Spinner spinnermess = (Spinner) findViewById(R.id.spinnermes);

        spinnermess.setAdapter(adapter);

        miBien.setText("Bienvenidos a la App");



        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alumno = nombreAlu.getText().toString();
                String apellidoP = apAlu.getText().toString();
                String apellidoM = amAlu.getText().toString();
                String generoAlu = geneAlu.getText().toString();
                String diaAlu = dia.getText().toString();
                String anoAlu = ano.getText().toString();
                String mesAlu =  spinnermess.getSelectedItem().toString();

                Toast.makeText(getApplicationContext(),"Alumno Registrado" , Toast.LENGTH_SHORT).show();

                String digito3 = alumno.substring(0, 1);
                String digito1 = apellidoP.substring(0, 2);
                String digito2 = apellidoM.substring(0, 1);
                String digito4 = anoAlu.substring(2, 4);

                int diaalu = Integer.parseInt(diaAlu);

                int ano = Integer.parseInt(anoAlu);

                int resultadoano;

                if( mesAlu == "01" || mesAlu == "02" || mesAlu == "03" || mesAlu == "04" || mesAlu == "05" ) {


                    resultadoano = 2019 - ano;

                }
                else {

                    resultadoano = 2018 - ano;
                }

                String resultado = String.valueOf(resultadoano);

                String signo=null;
                switch (mesAlu){

                    case "01":
                        if(diaalu <= 20)

                            signo = "Capricornio";

                        else

                            signo = "Acuario";

                        break;

                    case  "02":
                        if (diaalu <= 19)

                            signo = "Acuario";

                        else

                            signo = "Picis";

                        break;

                    case "03":
                        if (diaalu <= 20)

                            signo = "Picis";

                        else

                            signo = "Aries";

                        break;

                    case "04":
                        if(diaalu <= 20)

                            signo = "Aries";

                        else

                            signo = "Tauro";

                        break;

                    case  "05":
                        if (diaalu <= 21)

                            signo = "Tauro";

                        else

                            signo = "Geminis";

                        break;

                    case "06":
                        if (diaalu <= 21)

                            signo = "Geminis";

                        else

                            signo = "Cancer";

                        break;

                    case "07":
                        if(diaalu <= 23)

                            signo = "Cancer";

                        else

                            signo = "Leo";

                        break;

                    case  "08":
                        if (diaalu <= 23)

                            signo = "Leo";

                        else

                            signo = "Virgo";

                        break;

                    case "09":
                        if (diaalu <= 23)

                            signo = "Virgo";

                        else

                            signo = "Libra";

                        break;

                    case "10":
                        if(diaalu <= 23)

                            signo = "Libra";

                        else

                            signo = "Escorpion";

                        break;

                    case  "11":
                        if (diaalu <= 22)

                            signo = "Escorpion";

                        else

                            signo = "Sagitario";

                        break;

                    case "12":
                        if (diaalu <= 21)

                            signo = "Sagitario";

                        else

                            signo = "Capricornio";

                        break;

                        default:



                }

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("Nombre_del_Alumno",alumno);
                intent.putExtra("Apellido_Paterno",apellidoP);
                intent.putExtra("Apellido_Materno",apellidoM);
                intent.putExtra("Genero (M/F)",generoAlu);
                intent.putExtra("Edad",resultado);
                intent.putExtra("Horoscopo",signo);

                intent.putExtra("RFC", digito1 + digito2 + digito3 + digito4 + mesAlu + diaAlu);

                startActivity(intent);

                Log.i(LOGTAG, alumno);



            }
        });

        Log.d(LOGTAG, "dsdsdsds");



    }


}
