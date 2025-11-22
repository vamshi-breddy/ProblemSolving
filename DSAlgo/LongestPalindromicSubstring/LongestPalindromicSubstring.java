package com.DSAlgo.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "hellomalayalamhellosolutomaattimittaamotulos";
        findLongestPalindrome(s);
    }

    private static void findLongestPalindrome(String s) {
        int n = s.length();
        int i1,i2;
        int l=0;
        int len;
        String x = "";
        for(int i=0;i<s.length();i++){
            i1=i-1;
            i2=i+1;
            while(i1>=0 && i2<n){
                if(s.charAt(i1) == s.charAt(i2)){
                    len = (i2-i1)+1;
                    if(len>l){
                        l=len;
                        x=s.substring(i1,i2+1);
                    }
                }
                else{
                    break;
                }
                i1--;
                i2++;
            }

        }
        for(int i=0;i<s.length();i++){
            i1=i;
            i2=i+1;
            while(i1>=0 && i2<n){
                if(s.charAt(i1) == s.charAt(i2)){
                    len = (i2-i1)+1;
                    if(len>l){
                        l=len;
                        x=s.substring(i1,i2+1);
                    }
                }
                else{
                    break;
                }
                i1--;
                i2++;
            }

        }
        System.out.println(x);
    }
}
