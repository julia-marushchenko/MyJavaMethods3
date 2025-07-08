// Java program to demonstrate

package com.mthods;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating variables
        int number1 = 7;
        int number2 = 11;

        // Calling method countSum(int number1, int number2) and printing result
        System.out.println(Main.countSum(number1, number2)); // Output 18

        // Calling method countSum1(int number1, int number2) and printing result
        System.out.println(new Main().countSum1(number1, number2)); // Output 18
    }

    // Static method with two parameters
    public static int countSum(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    // Non-static method with two parameters
    public int countSum1(int number1, int number2){
        int result = number1 + number2;
        return result;
    }
}