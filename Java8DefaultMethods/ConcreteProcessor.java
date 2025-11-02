package com.Java8DefaultMethods;

class ConcreteProcessor extends DataProcessor {
    @Override
    public void performOperation() {
        System.out.println("Subclass performing its unique operation.");
    }
}