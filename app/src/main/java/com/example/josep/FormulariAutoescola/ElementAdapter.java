package com.example.josep.FormulariAutoescola;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class ElementAdapter extends ArrayAdapter<ObjecteGuardar> {
    public int resourceId;


    public ElementAdapter(Context context, int resource, List<ObjecteGuardar> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ObjecteGuardar instancia= getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(this.resourceId, parent, false);
        }

        TextView nom = (TextView)  convertView.findViewById(R.id.nom);
        TextView data = (TextView)  convertView.findViewById(R.id.data);
        TextView numeroTest = (TextView)  convertView.findViewById(R.id.numeroTest);
        TextView preguntesIncorrectes = (TextView)  convertView.findViewById(R.id.textView13);


        nom.setText("Nom:   "+instancia.getNom());
        data.setText("Data:   " +instancia.getData());
        numeroTest.setText(instancia.getIdTest());
        preguntesIncorrectes.setText("Errors: "+ instancia.getPreguntesIncorrectes());



        return convertView;
    }
}