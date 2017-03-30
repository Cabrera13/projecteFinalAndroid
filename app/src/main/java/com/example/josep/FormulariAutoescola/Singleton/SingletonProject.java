package com.example.josep.FormulariAutoescola.Singleton;

import com.example.josep.FormulariAutoescola.ObjecteGuardar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SingletonProject {
    private ObjecteGuardar element;
    private int posicio;
    private boolean login;
    private static SingletonProject ourInstance = new SingletonProject();

    public static SingletonProject getInstance() {
        return ourInstance;
    }
    private ArrayList<ObjecteGuardar> list;

    private SingletonProject() {
        this.list = new ArrayList<ObjecteGuardar>();
        this.element= null;
        this.posicio = -1;
        this.login = false;

        ObjecteGuardar un = new ObjecteGuardar("Josep", "jssdlcu@gmail.com", "24-12-15", "Test 1", Boolean.TRUE, Boolean.TRUE, "5", Boolean.TRUE, Boolean.TRUE,Boolean.TRUE, Boolean.TRUE, "6", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, 5);
        ObjecteGuardar dos = new ObjecteGuardar("Juan", "juan@outlook.es", "12-01-17", "Test 2", Boolean.TRUE, Boolean.TRUE, "5", Boolean.TRUE, Boolean.TRUE,Boolean.TRUE, Boolean.TRUE, "6", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, 4);

        this.list.add(un);
        this.list.add(dos);
    }

    public boolean getLogin() {return login;}

    public void setLogin(boolean login) {this.login = login;}

    public int getPosicio() {
        return posicio;
    }

    public void setPosicio(int posicio) {
        this.posicio = posicio;
    }

    public void setList(ArrayList<ObjecteGuardar> list) {
        this.list = list;
    }

    public ArrayList<ObjecteGuardar> getList() {
        return this.list;
    }
    public ObjecteGuardar agafarElement() {return this.element;}
    public void afegirElement(ObjecteGuardar element) {this.element = element;}

    public void objecteAfegir (ObjecteGuardar element) {
        this.list.add(element);
    }
    public void objecteGuardar () {

    }
    public void objecteEliminar () {
        this.list.remove(posicio);
    }
    public void editar (ObjecteGuardar element) {
        String nom = this.list.get(posicio).getNom();
        String mail = this.list.get(posicio).getNom();
        String data = this.list.get(posicio).getNom();
        this.list.remove(posicio);
        this.list.add(posicio, element);
        this.list.get(posicio).setNom(nom);
        this.list.get(posicio).setMail(mail);
        this.list.get(posicio).setData(data);
    }

}
