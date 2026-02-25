package com.aman.dsa.recursion;

public class SubSequencesUsingRecursion {
    public static void subSequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        subSequences(str, idx+1, newString+str.charAt(idx));

        subSequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";

        subSequences(str, 0, "");
    }
}
