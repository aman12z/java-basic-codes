package com.learn.java;

import java.util.*;
public class IFELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int age = sc.nextInt();


        if(age>18)
            System.out.println("enable");
        else
            System.out.println("disable");
    }

}
