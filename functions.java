package com.learn.java;

import java.util.*;
public class functions {

    public static void printMyName(String name) { //decleartion
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name); // call function


    }
}
