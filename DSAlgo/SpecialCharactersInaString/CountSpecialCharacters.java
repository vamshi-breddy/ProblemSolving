package com.DSAlgo.SpecialCharactersInaString;

public class CountSpecialCharacters {

    public static void main(String[] args) {
        String s = "CloudTech@$))&*(%^";
        int count = 0;
        for (int i = 0; i < s.length();i++) {
            if(!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No Special Characters");
        }
        else {
            System.out.println("Special Characters"+count);
        }
    }
}
