package com.company;

/**
 * Created by Fabian on 07.12.2015.
 */
abstract public class Wertanlage {
    /* --------------------------- */
    // ### Klassen - ATTRIBUTE ### //

    private String besitzer;
    private int grundMiete;
    private String name;
    private int position;
    private int wert;

    /* -------------------------- */
    // ### Klassen - METHODEN ### //

    // Abstrakte Methode -> Muss vom Erben gefüllt werden
    abstract int mieteBerechnen();

    // Gibt die Karte der Wertanlage aus
    // "name" ist class-intern, daher ohne Punkt-Operator
    abstract void anzeigen();

    // Wechselt den Besitzer einer Wertanlage bei Ver-/Kauf
    // "this." weil die Variable dieser(!) Klasse gemeint ist
    public void besitzerWechseln(String neuerBesitzer){
        this.besitzer = neuerBesitzer;
    }

    /* ---------------------------- */
    // ### SET / GET - Methoden ### //

    public void setBesitzer(String besitzer){
        this.besitzer = besitzer;
    }

    public String getBesitzer() { return this.besitzer; }

    public void setGrundMiete(int grundMiete) { this.grundMiete = grundMiete; }

    public int getGrundMiete(){ return this.grundMiete; }

    public void setName(String name){
        this.name = name;
    }

    public String getName() { return this.name; }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition() { return this.position; }

    public void setWert(int wert){
        this.wert = wert;
    }

    public int getWert() { return this.wert; }
}

