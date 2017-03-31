package com.example.josep.FormulariAutoescola;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Declaracions editText
    EditText editText1;
    EditText editText2;

    //Declaracio LinearLayout
    LinearLayout activitymain;

    //variables per les dates
    public int Any, Mes, Dia;

    //Declaració context per fer els toast
    final Context context = this;

    //Buttons
    Button buttonTest1;
    Button buttonTest2;
    Button buttonTest3;
    Button buttonData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Declaració activitymain
        activitymain = (LinearLayout) findViewById(R.id.activity_main2);





        //Delaracio EditText
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);

        //Declaracio buttons
        buttonData = (Button) findViewById(R.id.buttonData);
        buttonTest1 = (Button) findViewById(R.id.buttonTest1);
        buttonTest2 = (Button) findViewById(R.id.buttonTest2);
        buttonTest3 = (Button) findViewById(R.id.buttonTest3);

        buttonData.setOnClickListener(this);



        //Listeners dels intents a les diferents activitats i traspàs de variables cap a les diferents activitats per, posteriorment, ficarles a l'objecteGuardar

        buttonTest1.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               //String per comparar si la data es valida o no s'ha introduit res
                                               String compararButton;
                                               compararButton = "Selecciona la Data:";

                                               //Validacions de les dades, si estan introduides o no, i si no ho estan, indicar-ho amb el toast
                                               if (editText1.getText().toString().isEmpty() | editText2.getText().toString().isEmpty() || buttonData.getText().toString().equals(compararButton)) {
                                                   Toast toast = Toast.makeText(context, "Omple els camps abans de fer el test!", Toast.LENGTH_SHORT);
                                                   toast.show();

                                               }
                                               else {
                                                    // Push a l'activity del test corresponent
                                                   Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                                   intent.putExtra("nom", editText1.getText().toString());
                                                   intent.putExtra("mail", editText2.getText().toString());
                                                   intent.putExtra("data", buttonData.getText().toString());
                                                   intent.putExtra("mode", "afegir");
                                                   startActivity(intent);
                                                   finish();

                                               }
                                           }
                                       }
        );
        buttonTest2.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               String compararButton;
                                               compararButton = "Selecciona la Data:";
                                               if (editText1.getText().toString().isEmpty() | editText2.getText().toString().isEmpty() || buttonData.getText().toString().equals(compararButton)) {
                                                   Toast toast = Toast.makeText(context, "Omple els camps abans de fer el test!", Toast.LENGTH_SHORT);
                                                   toast.show();                                               }
                                               else {
                                                   Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                                                   intent.putExtra("nom", editText1.getText().toString());
                                                   intent.putExtra("mail", editText2.getText().toString());
                                                   intent.putExtra("data", buttonData.getText().toString());
                                                   intent.putExtra("mode", "afegir");

                                                   startActivity(intent);
                                                   finish();

                                               }

                                           }
                                       }
        );

        buttonTest3.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               String compararButton;
                                               compararButton = "Selecciona la Data:";
                                               if (editText1.getText().toString().isEmpty() | editText2.getText().toString().isEmpty() || buttonData.getText().equals(compararButton) ) {
                                                   Toast toast = Toast.makeText(context, "Omple els camps abans de fer el test!", Toast.LENGTH_SHORT);
                                                   toast.show();                                               }
                                               else {

                                                   Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                                                   intent.putExtra("nom", editText1.getText().toString());
                                                   intent.putExtra("mail", editText2.getText().toString());
                                                   intent.putExtra("data", buttonData.getText().toString());
                                                   intent.putExtra("mode", "afegir");

                                                   startActivity(intent);
                                                   finish();

                                               }

                                           }
                                       }
        );
    }

    void AgafarElement(){

    }
    void AfegirElem(){

    }

    //codi del dialog del calendari
    @Override
    public void onClick(View v) {


        // Agafar data actual
        final Calendar c = Calendar.getInstance();
        Any = c.get(Calendar.YEAR);
        Mes = c.get(Calendar.MONTH);
        Dia = c.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int Any,
                                          int Mes, int Dia) {

                        buttonData.setText(Dia + "-" + (Mes + 1) + "-" + Any);

                    }
                }, Any, Mes, Dia);
        datePickerDialog.show();
    }
}