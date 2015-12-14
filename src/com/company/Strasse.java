package com.company;

/**
 * Created by Fabian on 07.12.2015.
 */
public class Strasse extends Wertanlage {
    /* --------------------------- */
    // ### Klassen - ATTRIBUTE ### //

    private int hausanzahl;


    /* -------------------------- */
    // ### Klassen - METHODEN ### //

    Strasse(String name, int wert, int grundmiete, int position){
        setName(name);
        setBesitzer("Bank");
        setGrundMiete(grundmiete);
        this.hausanzahl = 0;
        setWert(wert);
        setPosition(position);
    }

    @Override // Abstrakte Methode aus ParentClass wird gefüllt
    public int mieteBerechnen() {
        return getGrundMiete() * (1 + this.hausanzahl);
    }

    @Override
    public void anzeigen(){
        System.out.println("**********************************");
        System.out.println("***   " + getName() );
        System.out.println("***");
        System.out.println("***   Wert: " + getWert() );
        System.out.println("***   Grundmiete: " + getGrundMiete() );
        System.out.println("***   Hausanzahl: " + this.hausanzahl);
        System.out.println("***");
        System.out.println("***");
        System.out.println("***   Momentaner Besitzer:");
        System.out.println("***   " + getBesitzer() );
        System.out.println("**********************************");
    }

    /* ---------------------------- */
    // ### SET / GET - Methoden ### //

    public void setHausanzahl(int hausanzahl){
        this.hausanzahl = hausanzahl;
    }

    public int getHausanzahl() {
        return this.hausanzahl;
    }
}
