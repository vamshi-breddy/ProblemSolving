package com.Java8DefaultMethods;

// Interface must rely on an abstract method to get the 'state'
interface DataTransformer {
    // Abstract method must be implemented by the class to provide state
    int getMultiplier(); 

    // Default method: Cannot access non-static state directly
    default void transformValue(int input) {
        // Must call an abstract method to get the required data (the "state")
        int multiplier = getMultiplier();
        int result = input * multiplier; 
        System.out.println("Interface: Result is " + result);
    }
}

