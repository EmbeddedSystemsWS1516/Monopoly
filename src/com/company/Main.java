package com.company;

import java.util.ArrayList;
import java.util.List;



public class Main {



    public static void main(String[] args) {

        // Testpart DANIEL
        System.out.println("Testpart DANIEL:");
        System.out.println("");

        Player Player1 = new Player("Daniel", 1000, "rotes_Auto");
        List<ImmoTest> ImmobilienListe = new ArrayList<>();

        ImmobilienListe.add(new StraßeTest(0,"Los",0));
        ImmobilienListe.add(new StraßeTest(1,"Schlossstraße",100));
        ImmobilienListe.add(new StraßeTest(2,"Grantham-Allee",1100));
        ImmobilienListe.add(new WerkTest(3,"Wasserwerk",100));
        ImmobilienListe.add(new StraßeTest(4,"Hauptstraße",100));
        ImmobilienListe.add(new StraßeTest(5,"B56",100));




        Player1.kaufen(0, ImmobilienListe);
        Player1.kaufen(1, ImmobilienListe);
        Player1.kaufen(2, ImmobilienListe);
        Player1.kaufen(6, ImmobilienListe);

        System.out.println();
        Player1.kaufen(1, ImmobilienListe);


        //Die Die0 = new Die(1, 6);

        //for(int i=0; i<9; i++){
        //    System.out.println (Die0.roll());
        //}


        // Testpart FABIAN
        System.out.println("");
        System.out.println("");
        System.out.println("Testpart FABIAN:");
        System.out.println("");

        // Teststraßen anlegen
        System.out.println("Karten werden angelegt (Straße und Werk) und angezeigt:");

        Strasse strasse1 = new Strasse("Parkstraße", 300, 100, 4);
        Werk werk1 = new Werk ("Wasserwerk", 200, 50, 8);

        strasse1.anzeigen();
        werk1.anzeigen();

        // Besitzer der Teststraßen zuweisen
        // In der Endumsetzung mit "SpielerX.name"
        System.out.println("Besitzer der Karten werden festgelegt und die Karten angezeigt:");

        strasse1.setBesitzer("Fabian");
        werk1.setBesitzer("Daniel");

        strasse1.anzeigen();
        werk1.anzeigen();

        // Besitzer von strasse2 wechseln
        System.out.println("Besitzer von strasse2 wechselt; Karten werden angezeigt:");

        werk1.besitzerWechseln("Fabian");

        strasse1.anzeigen();
        werk1.anzeigen();
    }
}
