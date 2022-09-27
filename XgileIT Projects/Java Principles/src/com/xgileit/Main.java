package com.xgileit;

import com.xgileit.Calculator;

/**
 * @author Mpho Makhari
 * Calculator Application
 */
public class Main {




    public static void main(String[] args)
    {
        Calculator objCalc = new Calculator();
        System.out.println("Initial Value: " + objCalc.toString());

        System.out.println("\nI used 100 as a new value");
        objCalc = new Calculator(100);
        // or  objCalc.setValue(100);
        System.out.println("Additional Method: " + objCalc.additionValue());
        System.out.println("Multiplication Method: " + objCalc.multiplicationValue());
        System.out.println("Subtraction Method: " + objCalc.subtractionValue());
        System.out.println("Division Method: " + objCalc.divisionValue());


    }
}