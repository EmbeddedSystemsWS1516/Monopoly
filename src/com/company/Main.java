package com.company;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {


// Würfel anlegen
        Die Die0 = new Die(1, 6);

// Spieler anlegen
        Player Player1 = new Player("Daniel", 1000, "rotes_Auto");
        Player Player2 = new Player("Fabian", 5000, "gelbes_Flugzeug");

// Wertanlagen Liste anlegen
        List<Wertanlage> WertanlagenListe = new ArrayList<>();

// Straßen und Werke anlegen
        WertanlagenListe.add(new Strasse("Los",0,0,0));
        WertanlagenListe.add(new Strasse("Schlossstraße",400,50,1));
        WertanlagenListe.add(new Strasse("Grantham-Allee",1100,60,2));
        WertanlagenListe.add(new Werk("Wasserwerk",100,20,3));
        WertanlagenListe.add(new Strasse("Hauptstraße",700,80,4));
        WertanlagenListe.add(new Strasse("B56",100,10,5));

//Alle Straßen anzeigen
        for(Wertanlage i : WertanlagenListe) { i.anzeigen(); }


        Player1.kaufen(0, WertanlagenListe);
        Player1.kaufen(1, WertanlagenListe);
        Player1.kaufen(2, WertanlagenListe);
        Player1.kaufen(6, WertanlagenListe);

        Player2.kaufen(3, WertanlagenListe);

        Player1.kaufen(1, WertanlagenListe);

//Alle Straßen anzeigen
        for(Wertanlage i : WertanlagenListe) { i.anzeigen(); }


// Testwürfeln
        for(int i=0; i<5; i++){
            System.out.println (Die0.roll());
        }


        // Testpart FABIAN
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Testpart FABIAN:");
//        System.out.println("");
//
//        // Teststraßen anlegen
//        System.out.println("Karten werden angelegt (Straße und Werk) und angezeigt:");
//
//        Strasse strasse1 = new Strasse("Parkstraße", 300, 100, 4);
//        Werk werk1 = new Werk ("Wasserwerk", 200, 50, 8);
//
//        strasse1.anzeigen();
//        werk1.anzeigen();
//
//        // Besitzer der Teststraßen zuweisen
//        // In der Endumsetzung mit "SpielerX.name"
//        System.out.println("Besitzer der Karten werden festgelegt und die Karten angezeigt:");
//
//        strasse1.setBesitzer("Fabian");
//        werk1.setBesitzer("Daniel");
//
//        strasse1.anzeigen();
//        werk1.anzeigen();
//
//        // Besitzer von strasse2 wechseln
//        System.out.println("Besitzer von strasse2 wechselt; Karten werden angezeigt:");
//
//        werk1.besitzerWechseln("Fabian");
//
//        strasse1.anzeigen();
//        werk1.anzeigen();
    }
}
