package com.Java8DefaultMethods;

public class MethodComparison {
    public static void main(String[] args) {
        ConcreteProcessor proc = new ConcreteProcessor();
        proc.processValue(20); // Output: Abstract Class: Result is 200 (20 * 10)
        
        TransformerImpl trans = new TransformerImpl();
        trans.transformValue(20); // Output: Interface: Result is 100 (20 * 5)
    }
}