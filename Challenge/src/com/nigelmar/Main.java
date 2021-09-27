package com.nigelmar;

public class Main {

    public static void main(String[] args) {

	    int intValue = 2400;


	    byte myByteValue= 60;

	    short myShortValue=300;

	    long myLongValue = 150L;
	    long myNewLongValue = (long) (myLongValue = 50000L + 10L * myByteValue + myShortValue + intValue);
        System.out.println(myNewLongValue);

        /* Correct answer is long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println("LongTotal = " + longTotal); longTotal= 50800
		myAnswer = 53300
		*/
    }
}
