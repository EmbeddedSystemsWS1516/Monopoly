package com.company;


abstract class ImmoTest {
    String name="";
    int position;
    int wert;
    String owner;


    boolean kaufen(String new_owner){
        if(owner == null) {
            System.out.println("Das Objekt kann gekauft werden!");
            owner = new_owner;
            return true;                       // Kaufen erfolgreich
        }
        if (owner.equals(new_owner)) {
            System.out.println("Das Objekt gehoert dem Spieler bereits!");
            return false;
        }
        else {
            System.out.println("Das Objekt kann nicht gekauft werden, da es " + owner + " gehört.");
            return false;
        }
    }


}
