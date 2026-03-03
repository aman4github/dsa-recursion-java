package com.aman.dsa.recursion;

public class MoveAllXToTheEndUsingRecursion {
    public static void move(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        if (str.charAt(idx) == 'x') {
            System.out.println("Count++");
            move(str, idx + 1, count + 1, newStr);
        } else {
            newStr += str.toLowerCase().charAt(idx);
            move(str, idx + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "axbxvxcdmxx";

        move(str, 0, 0, "");
    }
}

