package com.example.josep.FormulariAutoescola;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Formulari extends AppCompatActivity {
    final Context context = this;

    Button afegirFormulari;
    Button editarFormulari;
    Button esborrarFormulari;
    Button consultarFormulari;

    MenuItem menu;
/*
    private MenuItem guardar;
    private MenuItem editar;
    private MenuItem borrar;



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.action_bar_list, menu);
        guardar = menu.getItem(0);
        editar =  menu.getItem(1);
        editar.setEnabled(false);
        editar.setVisible(false);
        return true;
    }


    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        MenuInflater inflater = mode.getMenuInflater();
        inflater.inflate(R.menu.action_bar_list, menu);
        menu.findItem(R.id.itemBorrar).setVisible(true);
        menu.findItem(R.id.itemEditar).setVisible(true);
        menu.findItem(R.id.itemGuardar).setVisible(true);
        return true;
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulari);


        ListView list = (ListView) findViewById(R.id.listView);
        afegirFormulari = (Button) findViewById(R.id.crearFormulari);
        editarFormulari = (Button) findViewById(R.id.editarFormulari);
        esborrarFormulari = (Button) findViewById(R.id.esborrarFormulari);
        consultarFormulari = (Button) findViewById(R.id.consultarFormulari);
        final SingletonProject instancia = SingletonProject.getInstance();
        final ArrayList<ObjecteGuardar> arrayInstancies = instancia.getList();
        final ElementAdapter adapter = new ElementAdapter(this, R.layout.arrayadapter, arrayInstancies );
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                view.setSelected(true);
                ObjecteGuardar item = (ObjecteGuardar) parent.getItemAtPosition(position);
                int x = instancia.getPosicio();


                instancia.setPosicio(position);
                SingletonProject.getInstance().afegirElement(item);
                try {
                    parent.getChildAt(x).setBackgroundResource(R.drawable.values);
                }
                catch (NullPointerException e){}
                parent.getChildAt(position).setBackgroundResource(R.drawable.values2);

            }
        });

        afegirFormulari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Formulari.this,MainActivity.class);
                startActivity(i);

            }
        });
        editarFormulari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (instancia.getPosicio() != -1){
                    if (instancia.getLogin()) {
                        String id = arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getIdTest();
                        Intent i = new Intent(Formulari.this, MainActivity.class);
                        switch (id) {
                            case "Test 1":
                                i = new Intent(Formulari.this, Main2Activity.class);
                                break;
                            case "Test 2":
                                i = new Intent(Formulari.this, Main3Activity.class);
                                break;
                            case "Test 3":
                                i = new Intent(Formulari.this, Main4Activity.class);
                                break;
                            default:
                                break;
                        }
                        i.putExtra("mode", "editar");
                        startActivity(i);


                    }
                    else {
                        Intent i = new Intent(Formulari.this, login.class);
                        startActivity(i);
                        finish();


                    }

                }
                else {
                    Toast toast = Toast.makeText(context, "Has de seleccionar un formulari!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        consultarFormulari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (instancia.getPosicio() != -1) {
                    String id = arrayInstancies.get(SingletonProject.getInstance().getPosicio()).getIdTest();
                    Intent i = new Intent(Formulari.this, MainActivity.class);
                    switch (id){
                        case "Test 1":
                            i = new Intent(Formulari.this,Main2Activity.class);
                            break;
                        case "Test 2":
                            i = new Intent(Formulari.this,Main3Activity.class);
                            break;
                        case "Test 3":
                            i = new Intent(Formulari.this,Main4Activity.class);
                            break;
                        default:
                            break;
                    }
                    i.putExtra("mode", "consultar");
                    startActivity(i);
                }
                else {
                    Toast toast = Toast.makeText(context, "Has de seleccionar un formulari!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        esborrarFormulari.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (instancia.getPosicio() != -1) {
                    try {
                        instancia.getList().get(instancia.getPosicio());
                        if (instancia.getLogin()) {
                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                                    context);

                            alertDialogBuilder.setTitle("Estas segur que vols eliminar el formulari?");

                            alertDialogBuilder
                                    .setCancelable(false)
                                    .setPositiveButton("Si",new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,int id) {
                                            instancia.objecteEliminar();
                                            adapter.notifyDataSetChanged();
                                        }
                                    })
                                    .setNegativeButton("No",new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,int id) {
                                            dialog.cancel();
                                        }
                                    });
                            AlertDialog alertDialog = alertDialogBuilder.create();

                            alertDialog.show();

                        } else {
                            Intent i = new Intent(Formulari.this, login.class);
                            startActivity(i);
                            finish();
                        }
                    } catch (IndexOutOfBoundsException e) {
                        Toast toast = Toast.makeText(context, "Has de seleccionar un formulari!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                } else {
                    Toast toast = Toast.makeText(context, "Has de seleccionar un formulari!", Toast.LENGTH_SHORT);
                    toast.show();
                }





            }
        });





    }

}
