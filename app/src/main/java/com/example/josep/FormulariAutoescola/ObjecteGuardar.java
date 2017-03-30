package com.example.josep.FormulariAutoescola;



public class ObjecteGuardar {


    //Declaracions de parametres per pasarles al constructor

    String nom;
    String mail;
    String data;
    String idTest;
    Boolean Radio1;
    Boolean Radio2;
    String editText2;
    Boolean checkBox1;
    Boolean checkBox2;
    Boolean Radio3;
    Boolean Radio4;
    String editText3;
    Boolean Radio5;
    Boolean Radio6;
    Boolean Radio7;
    Boolean Radio8;
    Boolean Radio9;
    Integer preguntesIncorrectes;



    //Constructor i rebuda de parametres
    public ObjecteGuardar(    String nom, String mail, String data, String idTest, Boolean Radio1, Boolean Radio2, String editText2, Boolean checkBox1, Boolean checkBox2,
            Boolean Radio3, Boolean Radio4, String editText3, Boolean Radio5, Boolean Radio6, Boolean Radio7, Boolean Radio8, Boolean Radio9, Integer preguntesIncorrectes){

        this.nom = nom;
        this.mail = mail;
        this.data = data;
        this.idTest = idTest;
        this.Radio1 = Radio1;
        this.Radio2 = Radio2;
        this.editText2 = editText2;
        this.checkBox1 = checkBox1;
        this.checkBox2 = checkBox2;
        this.Radio3 = Radio3;
        this.Radio4 = Radio4;
        this.editText3 = editText3;
        this.Radio5 = Radio5;
        this.Radio6 = Radio6;
        this.Radio7 = Radio7;
        this.Radio8 = Radio8;
        this.Radio9 = Radio9;
        this.preguntesIncorrectes = preguntesIncorrectes;


    }

    public Integer getPreguntesIncorrectes() {return preguntesIncorrectes;}

    public void setPreguntesIncorrectes(Integer preguntesIncorrectes) {this.preguntesIncorrectes = preguntesIncorrectes;}

    //getters seters
    public String getNom() {return this.nom;}
    public void setNom (String value) {this.nom = value;}
    public String getMail() {return this.mail;}
    public void setMail(String value) {this.mail = value;}
    public String getData() {return this.data;}
    public void setData(String value) {this.data = value;}
    public String getIdTest() {return this.idTest;}
    public void setIdTest(String value) {this.idTest = value;}
    public Boolean getRadio1() {return this.Radio1;}
    public void setRadio1(Boolean value) {this.Radio1 = value;}
    public Boolean getRadio2() {return this.Radio2;}
    public void setRadio2(Boolean value) {this.Radio2 = value;}
    public String getEditText2() {return this.editText2;}
    public void setEditText2 (String value) {this.editText2 = value;}
    public Boolean getCheckBox1() {return this.checkBox1;}
    public void setCheckBox1(Boolean value) {this.checkBox2 = value;}
    public Boolean getCheckBox2() {return this.checkBox2;}
    public void setCheckBox2(Boolean value) {this.checkBox2 = value;}
    public Boolean getRadio3() {return this.Radio3;}
    public void setRadio3(Boolean value) {this.Radio3 = value;}
    public Boolean getRadio4() {return this.Radio4;}
    public void setRadio4(Boolean value) {this.Radio4 = value;}
    public String getEditText3() {return this.editText3;}
    public void setEditText3 (String value) {this.editText3 = value;}
    public Boolean getRadio5() {return this.Radio5;}
    public void setRadio5(Boolean value) {this.Radio5 = value;}
    public Boolean getRadio6() {return this.Radio6;}
    public void setRadio6(Boolean value) {this.Radio6 = value;}
    public Boolean getRadio7() {return this.Radio7;}
    public void setRadio7(Boolean value) {this.Radio7 = value;}
    public Boolean getRadio8() {return this.Radio8;}
    public void setRadio8(Boolean value) {this.Radio8 = value;}
    public Boolean getRadio9() {return this.Radio9;}
    public void setRadio9(Boolean value) {this.Radio9 = value;}

    //Metode toString per ensenyar les dades
    @Override
    public String toString() { return nom + mail + data + idTest.toString() + Radio1.toString() + Radio2.toString()
            +editText2.toString()+checkBox1.toString()+checkBox2.toString()+Radio3.toString()+Radio4.toString()+ editText3.toString()+ Radio5.toString()+Radio6.toString()+Radio7.toString()+
        Radio8.toString()+Radio9.toString();}
}


