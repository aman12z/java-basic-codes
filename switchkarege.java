package com.learn.java;
import java.util.*;
public class switchkarege {
    public static void main(String[] args) {
        Scanner land = new Scanner(System.in);
        int button = land.nextInt();
        switch (button) {
            case 1:
                System.out.println("great");
                break;
            case 2:
                System.out.println("g");
                break;
            case 3:
                System.out.println("r");
                break;
            case 4:
                System.out.println("eat");
                break;
            default :
            System.out.println("strange");
        }
    }
}
