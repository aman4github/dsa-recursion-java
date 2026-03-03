package com.aman.dsa.recursion;

public class KeypadPhoneStringCombinationUsingRecursion {
    public static String[] charList = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void solution(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char ch = str.charAt(idx);
        String value = charList[ch - '0'];

        for (int i = 0; i < value.length(); i++) {
            solution(str, idx+1, combination+value.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "12";

        solution(str, 0, "");
    }
}
