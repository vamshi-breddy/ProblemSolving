package com.DSAlgo.cognida.ai.AddFloatingNumbers;

public class AddFloatingNumbers {
    public static void main(String[] args) {
        String a = "1234.9";
        String b = "9876.1";
        String c= "";
        int sum;
        int firstDigit;
        int secondDigit = 0;

        for(int i=a.length()-1;i>=0;i--){
            sum=0;
            if(Character.isDigit(a.charAt(i)) && Character.isDigit(b.charAt(i))){
                sum = Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(i)))+secondDigit;
                firstDigit = sum%10;
                secondDigit = (sum/10)%10;

                c=c+firstDigit;
            }
            else {
                c=c+a.charAt(i);
            }

        }
        System.out.println(new StringBuilder(c).reverse());
    }
}
