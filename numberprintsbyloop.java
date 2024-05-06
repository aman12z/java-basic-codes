package com.learn.java;

import java.util.*;
public class numberprintsbyloop {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.println("write a number");
        int n = aman.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}