package com.learn.java;

import java.util.*;
public class compare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 == n2)
            System.out.println("equal");
        else if (n1 > n2)


            System.out.println("n1 is greater");
        else
            System.out.println("n1 is lesser");
    }
}
