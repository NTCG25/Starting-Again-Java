package com.nigelmar;

public class Main {

    public static void main(String[] args) {
	    // int has a width of 32
        int myMinValue= -2147483648;
        int myMaxValue=  2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " +myTotal);

        //byte has a width of 8
        byte myByteValue = -128; // can store up to 127 and as low as -128
        byte myNewByteValue = (byte) (myByteValue/2); // This is wrong because it won't physically fit into the area. Bytes are too small compared to int. Use (byte) to change it to byte instead of integer.
        System.out.println("myNewByteValue = "+ myNewByteValue);

        //short has a width of 16
        short myShortValue = 30000; // can store up to 32767 and as low as -32768
        short myNewShortValue = (short) (myShortValue/2);

        // long has a width of 64
        long myLongValue = 100L; // <--- put "L" or "l" on long values. Lowest: -9_223_372_036_854_775_808L Highest: 9_223_372_036_854_775_807L (-1)


    }
}
