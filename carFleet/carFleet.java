package com.carFleet;

import java.util.Arrays;
import java.util.Stack;

public class carFleet{

    public void calculateCarFleet(int target, int[] position, int[] speed){
        Car[] cars = new Car[position.length];
        for(int i=0;i< position.length;i++){
            cars[i] = new Car(position[i],(target-position[i])/speed[i]);
        }
        Arrays.sort(cars,(a,b)->a.position-b.position);

        Stack<Integer> fleet = new Stack<>();
        for(int i=cars.length-1;i>=0;i--){
            if(!fleet.isEmpty() && cars[i].time<=fleet.peek()){
                continue;
            }
            fleet.push(cars[i].time);
        }
        System.out.println(fleet.size());
    }

}
