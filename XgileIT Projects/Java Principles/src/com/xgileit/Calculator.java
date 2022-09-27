package com.xgileit;

/**
 * Create a simple calculator application
 * that has different methods
 * of calculation
 * (addition, multiplication, division and subtraction).
 *
 * @author Mpho Makhari2
 */
public class Calculator {

    //Declare instance variable
    private int value;

    /**
     * Default Constructor
     * This will initialize our value
     */
    public Calculator() {
        this(0);
    }

    /**
     * Parameterized constructor, to set new values
     * using setValue method and the passed value
     * @param value new value
     */
    public Calculator(int value) {
        setValue(value);
    }

    /**
     * Change the value object
     * @param value new value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Return the new value
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Add value by value
     * @return value + value
     */
    public int additionValue() {
        return value + value;
    }

    /**
     * Multiply value by value
     * @return value * value
     */
    public int multiplicationValue() {
        return value * value;
    }

    /**
     * divide value by value
     * @return value / value
     */
    public int divisionValue() {
        return value / value;
    }

    /**
     * Subtract value by value
     * @return value + value
     */
    public int subtractionValue() {
        return value - value;
    }

    @Override
    public String toString() {
        return "value: " + value ;
    }
}
