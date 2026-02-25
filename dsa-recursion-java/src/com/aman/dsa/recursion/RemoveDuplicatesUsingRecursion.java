package com.aman.dsa.recursion;

public class RemoveDuplicatesUsingRecursion {
    public static boolean[] hash = new boolean[26];

    public static void removeDuplicate(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        if (hash[str.charAt(idx) - 'a']) {
            removeDuplicate(str, idx += 1, newString);
        } else {
            newString += str.charAt(idx);
            hash[str.charAt(idx) - 'a'] = true;
            removeDuplicate(str, idx += 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccdaee";
        removeDuplicate(str, 0, "");
    }
}

