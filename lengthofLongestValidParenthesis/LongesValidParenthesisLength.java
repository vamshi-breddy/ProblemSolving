package com.lengthofLongestValidParenthesis;

import java.util.Stack;

public class LongesValidParenthesisLength {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        int max=0;
        String s= ")()())";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else {
                st.pop();
                if(st.empty()){
                    st.push(i);
                }
                else {
                    int len = i-st.peek();
                    max = Math.max(len,max);
                }
            }
        }
        System.out.println(max);
    }
}
