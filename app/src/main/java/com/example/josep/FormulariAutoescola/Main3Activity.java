package com.example.josep.FormulariAutoescola;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    final Context context = this;

    Integer numErrors;
    TextView textView0;
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;

    LinearLayout LinearButton;
    LinearLayout linearLayout;

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;


    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    Switch switchFinal;

    EditText editText1;
    EditText editText2;
    EditText editText3;

    CheckBox checkBox1;
    CheckBox checkBox2;

    Button buttonGuardar;
    Button buttonTest1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SingletonProject instancia = SingletonProject.getInstance();
        final ArrayList<ObjecteGuardar> arrayInstancies = instancia.getList();

        //Descripció i comentaris al Main2Activity

        LinearButton = (LinearLayout) findViewById(R.id.LinearButton);
        linearLayout = (LinearLayout) findViewById(R.id.activity_main2);

        radioButton1 = (RadioButton) findViewById(R.id.RadioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.RadioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.RadioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.RadioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.RadioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.RadioButton6);
        radioButton7 = (RadioButton) findViewById(R.id.RadioButton7);
        radioButton8 = (RadioButton) findViewById(R.id.RadioButton8);
        radioButton9 = (RadioButton) findViewById(R.id.RadioButton9);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        textView0 = (TextView) findViewById(R.id.textView0);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);

        switchFinal = (Switch) findViewById(R.id.switchFinal);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);

        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        buttonGuardar = (Button) findViewById(R.id.buttonGuardar);
        buttonTest1 = (Button) findViewById(R.id.buttonTest1);


        textView0.setText("Test 2");
        textView2.setText("Cada quants anys s'ha de pasar la ITV?");
        textView3.setText("Es pot aparcar els dies festius en zona blava sense pagar?");
        textView4.setText("Quants anys s'han de tenir per el carnet de 49cc?");
        textView5.setText("Es pot aparcar aqui els dies parells?");
        textView6.setText("Es pot adelantar en aquesta imatge?");
        textView7.setText("Quina és la velocitat màxima en via interurbana convencional? ");
        textView8.setText("Es pot adelantar davant de aquesta senyal? ");


        checkBox1.setText("Si");
        checkBox2.setText("No");


        radioButton1.setText("4 anys");
        radioButton2.setText("1 any");
        radioButton3.setText("Si");
        radioButton4.setText("No");
        radioButton5.setText("Si, a menys de 80km per hora");
        radioButton6.setText("No, de ninguna manera");
        radioButton7.setText("Si");
        radioButton8.setText("Si");
        radioButton9.setText("No");


        imageView1.setImageResource(R.drawable.senyalimpares);
        imageView2.setImageResource(R.drawable.cambiorasante);
        imageView3.setImageResource(R.drawable.permitdoadelantar);

        LinearButton.setVisibility(View.GONE);

        switchFinal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (switchFinal.isChecked()) {
                    LinearButton.setVisibility(View.VISIBLE);

                } else {
                    LinearButton.setVisibility(View.GONE);

                }
            }
        });

        checkBox1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (checkBox1.isChecked()) {

                    checkBox2.setChecked(false);
                }

            }

        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (checkBox2.isChecked()) {
                    checkBox1.setChecked(false);
                }

            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String mode = extras.getString("mode");
            if (mode != null) {
                if (mode.equals("editar")){
                    checkBox1.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getCheckBox1());
                    checkBox2.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getCheckBox2());
                    radioButton1.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio1());
                    radioButton2.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio2());
                    radioButton3.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio3());
                    radioButton4.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio4());
                    radioButton5.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio5());
                    radioButton6.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio6());
                    radioButton7.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio7());
                    radioButton8.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio8());
                    radioButton9.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio9());
                    editText2.setText(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getEditText2());
                    editText3.setText(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getEditText3());

                }
            }
        }

        if (extras != null) {
            String mode = extras.getString("mode");
            if (mode != null) {
                if (mode.equals("consultar")) {
                    checkBox1.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getCheckBox1());
                    checkBox2.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getCheckBox2());
                    radioButton1.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio1());
                    radioButton2.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio2());
                    radioButton3.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio3());
                    radioButton4.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio4());
                    radioButton5.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio5());
                    radioButton6.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio6());
                    radioButton7.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio7());
                    radioButton8.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio8());
                    radioButton9.setChecked(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getRadio9());
                    editText2.setText(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getEditText2());
                    editText3.setText(arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getEditText3());

                    //Desactivació dels elements per tal de deixar el layout en EditMode
                    radioButton1.setEnabled(false);
                    radioButton2.setEnabled(false);
                    radioButton3.setEnabled(false);
                    radioButton4.setEnabled(false);
                    radioButton5.setEnabled(false);
                    radioButton6.setEnabled(false);
                    radioButton7.setEnabled(false);
                    radioButton8.setEnabled(false);
                    radioButton9.setEnabled(false);

                    switchFinal.setEnabled(false);

                    editText2.setEnabled(false);
                    editText3.setEnabled(false);

                    checkBox1.setEnabled(false);
                    checkBox2.setEnabled(false);

                    //Validacions de les preguntes correctes (Diferent per a cada activity)

                    if (radioButton2.isChecked()){
                        radioButton2.setBackgroundColor(Color.parseColor("#e74c3c"));

                    }
                    if (checkBox1.isChecked()){
                        checkBox1.setBackgroundColor(Color.parseColor("#e74c3c"));


                    }
                    if (radioButton4.isChecked()){

                        radioButton4.setBackgroundColor(Color.parseColor("#e74c3c"));


                    }
                    if (radioButton6.isChecked()){

                        radioButton6.setBackgroundColor(Color.parseColor("#e74c3c"));


                    }
                    if (radioButton7.isChecked()){

                        radioButton7.setBackgroundColor(Color.parseColor("#e74c3c"));

                    }
                    if (radioButton9.isChecked()){
                        radioButton9.setBackgroundColor(Color.parseColor("#e74c3c"));

                    }
                    String x = "16";
                    if (!editText2.getText().toString().equals(x)) {
                        editText2.setBackgroundColor(Color.parseColor("#e74c3c"));

                    }
                    String x2 = "80";
                    if (!editText3.getText().toString().equals(x2)) {
                        editText3.setBackgroundColor(Color.parseColor("#e74c3c"));

                    }

                }
            }
        }

        //Logica del botó de guardar
        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Declaracio de variables per realitzar validacions de si el botó esta en posició de guardar o editar
                if (instancia.getPosicio() != -1) {
                    Bundle extras = getIntent().getExtras();

                    //Si això no es diferent a null (En teoria s'ha de complir sempre)
                    if (extras != null) {
                        String mode = extras.getString("mode");
                        if (!mode.equals("afegir"))
                            arrayInstancies.get(SingletonProject.getInstance().getPosicio()).setPreguntesIncorrectes(0);
                    }

                }
                int numErrors = 0;

                if (radioButton2.isChecked()){
                    numErrors++;
                }
                if (checkBox1.isChecked()){
                    numErrors++;

                }
                if (radioButton4.isChecked()){
                    numErrors++;


                }
                if (radioButton6.isChecked()){
                    numErrors++;


                }
                if (radioButton7.isChecked()){
                    numErrors++;

                }
                if (radioButton9.isChecked()){
                    numErrors++;
                }
                String x = "16";
                if (!editText2.getText().toString().equals(x)) {
                    numErrors++;
                }
                String x2 = "80";
                if (!editText3.getText().toString().equals(x2)) {
                    numErrors++;
                }
                Intent i = new Intent(Main3Activity.this, Formulari.class);


                //En cas de que estigui en posicio de guardar

                //Validacions per saber si les preguntes estan contestades

                if (radioButton1.isChecked() | radioButton2.isChecked() && checkBox1.isChecked() | checkBox2.isChecked()
                        && radioButton3.isChecked() | radioButton4.isChecked() && radioButton5.isChecked()
                        | radioButton6.isChecked() | radioButton7.isChecked() && radioButton8.isChecked() | radioButton9.isChecked() &&
                        !editText2.getText().toString().isEmpty() & !editText3.getText().toString().isEmpty()) {

                    //Rebuda de les dades del MainActivity

                    Bundle extras = getIntent().getExtras();

                    //Si això no es diferent a null (En teoria s'ha de complir sempre)
                    if (extras != null) {
                        String nom = extras.getString("nom");
                        String mail = extras.getString("mail");
                        String data = extras.getString("data");
                        String mode = extras.getString("mode");
                        //Instanciació de l'objecte pasant per paràmetres les dades corresponents
                        //Metode toString per printejar les dades per pantalla
                        if (mode != null) {
                            if (mode.equals("afegir")) {
                                ObjecteGuardar objectGuardar = new ObjecteGuardar(nom, mail, data, textView0.getText().toString(), radioButton1.isChecked(), radioButton2.isChecked(), editText2.getText().toString(), checkBox1.isChecked(), checkBox2.isChecked(),
                                        radioButton3.isChecked(), radioButton4.isChecked(), editText3.getText().toString(), radioButton5.isChecked(), radioButton6.isChecked(), radioButton7.isChecked(), radioButton8.isChecked(), radioButton9.isChecked(), numErrors);
                                instancia.objecteAfegir(objectGuardar);
                            }
                            else if (mode.equals("editar")) {
                                ObjecteGuardar objectGuardar = new ObjecteGuardar(nom, mail, data, textView0.getText().toString(), radioButton1.isChecked(), radioButton2.isChecked(), editText2.getText().toString(), checkBox1.isChecked(), checkBox2.isChecked(),
                                        radioButton3.isChecked(), radioButton4.isChecked(), editText3.getText().toString(), radioButton5.isChecked(), radioButton6.isChecked(), radioButton7.isChecked(), radioButton8.isChecked(), radioButton9.isChecked(), numErrors);
                                instancia.editar(objectGuardar);
                            }
                        }

                        startActivity(i);
                        finish();

                    }






                } else {
                    //validacio per donar retroaccio de que falten camps per omplir
                    Toast toast = Toast.makeText(context, "Et falten camps per omplir!", Toast.LENGTH_SHORT);
                    toast.show();

                }

                }


        });

    }
}
