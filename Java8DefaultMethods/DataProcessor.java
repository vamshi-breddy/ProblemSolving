package com.Java8DefaultMethods;

// Abstract Class can have state (instance variable)
abstract class DataProcessor {
    // State: Concrete method can access this protected field
    protected int baseValue = 10; 

    // Concrete method can use the state directly
    public void processValue(int input) {
        int result = input * baseValue; // Directly uses 'baseValue'
        System.out.println("Abstract Class: Result is " + result);
    }
    
    public abstract void performOperation(); // Forces subclass to implement
}

