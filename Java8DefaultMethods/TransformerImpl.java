package com.Java8DefaultMethods;

class TransformerImpl implements DataTransformer {
    // This is the instance state of the implementing class
    private final int multiplier = 5; 

    @Override
    public int getMultiplier() {
        return multiplier; // Provides the required state to the default method
    }
}