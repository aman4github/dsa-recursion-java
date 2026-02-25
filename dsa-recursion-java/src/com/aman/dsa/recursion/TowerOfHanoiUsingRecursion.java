package com.aman.dsa.recursion;

import java.util.Scanner;

public class TowerOfHanoiUsingRecursion {
    public static void solve(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println("Moved 1 from " + source + " to " + destination);
            return;
        }

        // Moved n-1 disks from source to helper
        solve(n-1, source, destination, helper);

        System.out.println("Moved " + n + " from " + source + " to " + destination);

        // Moved n-1 disks from helper to destination
        solve(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of disks : ");
        int n = sc.nextInt();

        solve(n, 'A', 'B', 'C');
    }
}

