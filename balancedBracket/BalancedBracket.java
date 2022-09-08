package com.balancedBracket;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}";
        if(balancedBracket(s)){
            System.out.println("Given string is balanced");
        }
        else
            System.out.println("not balanced");
    }

    private static boolean balancedBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x =s.charAt(i);
            if (x == '('|| x == '{'|| x == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            if(s.isEmpty()) return false;
            char c;
            switch (x) {
                case ')':
                    c =stack.pop();
                    if(c=='{'||c=='[') return false;
                    break;
                case '}':
                    c = stack.pop();
                    if (c == '('|| c =='[') return false;
                    break;
                case ']':
                    c = stack.pop();
                    if (c == '('||c=='{') return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
