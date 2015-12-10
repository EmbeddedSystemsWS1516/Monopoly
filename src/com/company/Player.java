package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int credit;
    private String symbol;
    private int position;

    //Konstruktor
    Player (String name_konstr, int money_konstr, String symbol_konstr) {  //Name festlegen und Symbol/Spielfigur (kann später nicht mehr geändert werden), Startkapital festlegen
        this.name = name_konstr;
        this.credit = money_konstr;
        this.symbol = symbol_konstr;
    }

    public String getName(){
        return name;
    }

    public int getMoney() {
        return credit;
    }

    public void setMoney(int ammount){
        credit = ammount;
    }

    public int getPosition(){ return position; }

    public void kaufen(int position, List<Wertanlage> WertanlagenListe){
        if(position==0){
            System.out.println("Los kann nicht gekauft werden!");
            return;
        }


        for(Wertanlage i : WertanlagenListe) {                  // gewünschtes Element suchen
            if (i.getPosition() == position){                   // Welches Element in der Liste entspricht dem angegebenen Spielfeld
                System.out.println("Spieler möchte " + i.getName() + " kaufen");
                if (i.getWert() <= getMoney()) {
                    System.out.println("Player hat genug Geld!");
                    i.setBesitzer(name);                        // Besitzer festlegen! Ob Straße frei ist muss vorher geprüft werden
                    credit -= i.getWert();
                    System.out.println("Spieler " + name + " hat jetzt noch " + credit + " Dollar");
     //               if(i.kaufen(name)) {                //kaufen war erfolgreich
     //                   credit -= i.getWert();
     //                   System.out.println("Spieler " + name + " hat jetzt noch " + credit + " Dollar");
     //               }                     // kaufen wird beauftragt, dabei wird geprüft, ob das Objekt noch frei ist
                }
                else{
                    System.out.println("Spieler hat nicht genug Geld!");         // es wird nicht versucht das Objekt zu kaufen und die Methode verlassen
                }
                return;
            }
        }

        System.out.println("An der Position " + position + " existiert keine Straße");          // Wenn nichts gefunden wurde, ist dieses Spielfeld nicht vergeben
    }


}
