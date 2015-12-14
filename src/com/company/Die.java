package com.company;
import java.util.Random;

public class Die {

    int num_low, num_high;  //  niedrigste und höchste Ziffer auf dem Würfel
    Random randomGenerator = new Random();

    //Konstruktor
    Die (int num_low_konst, int num_high_konst) {
        this.num_low = num_low_konst;
        this.num_high = num_high_konst;
    }


    int roll(){
        int randomInt = randomGenerator.nextInt(num_high-num_low+1)+num_low;
        return randomInt;
    }
}