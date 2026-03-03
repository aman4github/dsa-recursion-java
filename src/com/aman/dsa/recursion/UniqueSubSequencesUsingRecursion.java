package com.aman.dsa.recursion;

import java.util.HashSet;

public class UniqueSubSequencesUsingRecursion {
    public static void uniqueSubSequence(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        uniqueSubSequence(str, idx+1, newStr+str.charAt(idx), set);

        uniqueSubSequence(str, idx+1, newStr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSequence(str, 0, "", set);
    }
}
