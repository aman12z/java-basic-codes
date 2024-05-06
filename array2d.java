package com.learn.java;

import java.util.*;
public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int name[][] = new int[4][5];
        name[0][0] = sc.nextInt();
        name[0][1] = sc.nextInt();
        name[0][2] = sc.nextInt();
        for(int i = 0; i < name.length; i++)
            for (int j = 0; j < name[i].length; j++)
                System.out.println(name[i][j] + "");
    }
}