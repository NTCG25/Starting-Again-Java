package com.nigelmar;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 5; // two operators used "=" and "+"
        System.out.println("1 + 5 = " + result);

        int previousResult = result;

        result = result - 1; // subtract the current result. Result equals 4.
        System.out.println(previousResult + "-1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + "* 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 4;
        System.out.println(previousResult + " % 4 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++; // add the increment by 1
        System.out.println("Result is now " + result);
        result--; // subtract the increment by 1
        System.out.println("Result is now " + result);
        result += 2; // add or equate to the increment by two. Example: 4-1 = 3, 3 + 2 = 5
        System.out.println("Result is now " + result);
        result *= 10; // multiplies the result by 10
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = false; // Assignment Variable is setting the "isAlien" to false
        if (isAlien == true) // testing to see if the statement/value is false
            System.out.println("It is not an Alien!");
        else
            System.out.println("It's an Alien!!");

        int topScore = 80;
        if (topScore < 150);
            System.out.println("You got the high score!!"); // 14:27







    }
}
