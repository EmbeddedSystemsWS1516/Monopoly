package com.company;

/**
 * Created by Fabian on 07.12.2015.
 */
public class Werk extends Wertanlage {

    /* --------------------------- */
    // ### Klassen - ATTRIBUTE ### //

    private int mietfaktor;


    /* -------------------------- */
    // ### Klassen - METHODEN ### //

    Werk(String name, int wert, int grundmiete, int position){
        setName(name);
        setBesitzer("Bank");
        setGrundMiete(grundmiete);
        this.mietfaktor = 0;
        setWert(wert);
        setPosition(position);
    }

    @Override // Die übergeordnete abstrakte Methode wird überschrieben
    public int mieteBerechnen() {
        return (getGrundMiete() * (1+this.mietfaktor) );
    }

    @Override
    public void anzeigen(){
        System.out.println("**********************************");
        System.out.println("***   " + getName() );
        System.out.println("***");
        System.out.println("***   Wert: " + getWert() );
        System.out.println("***   Grundmiete: " + getGrundMiete() );
        System.out.println("***   Mietfaktor: " + this.mietfaktor);
        System.out.println("***");
        System.out.println("***");
        System.out.println("***   Momentaner Besitzer:");
        System.out.println("***   " + getBesitzer() );
        System.out.println("**********************************");
    }

    /* ---------------------------- */
    // ### SET / GET - Methoden ### //
}
