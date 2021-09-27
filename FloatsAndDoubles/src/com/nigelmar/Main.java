package com.nigelmar;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 10/2;

        // width of float = 32 ( 4 bytes)
        float myFloatValue =  4f; // can put decimal values. Floats gives exact value when divided

        // width of a double = 64 (8 bytes)
        double myDoubleValue = 10d / 2d; // can put decimal values here as well. Doubles gives exact values when divided. For example : 10d / 2d = 5.0. Far more precise.

        System.out.println("myInt = " + myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDoubleValue = "+ myDoubleValue);


    }
}
