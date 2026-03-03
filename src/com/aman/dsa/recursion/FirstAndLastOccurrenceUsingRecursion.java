package com.aman.dsa.recursion;

public class FirstAndLastOccurrenceUsingRecursion {

    public static int first = -1;
    public static int last = -1;

    public static void find(String str, int idx, char ele) {
        if (idx > str.length()-1) {
            return;
        }

        if (str.charAt(idx) == ele && first == -1) {
            first = idx;
        } else if (str.charAt(idx) == ele) {
            last = idx;
        }

        find(str, idx+1, ele);
    }

    public static void main(String[] args) {
        String str = "abcdabcdabcda";
        find(str, 0, 'a');

        System.out.println(FirstAndLastOccurrenceUsingRecursion.first);
        System.out.println(FirstAndLastOccurrenceUsingRecursion.last);
    }
}

