package com.nigelmar;

public class Main {

    public static void main(String[] args) {

        String myString = "This is not a drill, repeat this is not a drill!";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", duck and cover to avoid injuries.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2021";
        System.out.println("myString is equal to " + myString);


        String numberString = "45.59";
        numberString = numberString + "260.66";
        System.out.println("The results are " + numberString);
        // 45.59260.66 is the result. No calculations because there is no datatype defined ie float, double, byte, int, etc.

        String lastString = "10";
        int myLovelyInt = 94;
        lastString = lastString + myLovelyInt;
        System.out.println("LastString is equal to " + lastString);
    }
}
