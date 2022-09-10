package com.lengthofLongestValidParenthesis;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = findLengthOfLongest(s);
        System.out.println(n);
    }

    private static int findLengthOfLongest(String s) {
       char[] c= s.toCharArray();
       Stack<Integer> stack = new Stack<Integer>();
       for (int i = 0; i < c.length; i++) {
           if(!stack.empty() && c[i] == ')' && c[stack.peek()] == '('){
               stack.pop();
           }
           else stack.push(i);
       }

       int index = -1;
       int max = 0;
       for(int i:stack){
           max = Math.max(max, i-index-1);
           index = i;
       }
       max = Math.max(max,s.length()-index-1);
       return max;

    }
}
