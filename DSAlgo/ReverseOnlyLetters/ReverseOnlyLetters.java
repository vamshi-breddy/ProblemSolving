package com.DSAlgo.ReverseOnlyLetters;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s= "Test1ng-Leet=code-Q!";
        int low=0,high=s.length()-1;
        char []c = s.toCharArray();
        char temp;
        while (low < high) {
            if(Character.isAlphabetic(s.charAt(low)) && Character.isAlphabetic(s.charAt(high))){
                temp = c[low];
                c[low] =c[high];
                c[high] = temp;
                low++;
                high--;
            } else if (!Character.isAlphabetic(s.charAt(low))) {
                low++;
            } else if (!Character.isAlphabetic(s.charAt(high))) {
                high--;
            }
        }
        System.out.println(c);
    }
}
