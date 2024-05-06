package com.learn.java;

import java.util.*;

public class odd_even_program {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("enter the number");
        int num = l.nextInt();

        if(num%2==0)
            System.out.println("even number");
        else
            System.out.println("may be odd");


    }

}
