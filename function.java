package com.learn.java;
import java.util.*;
/*public class function {
    public static void printmyName(String name) {
        System.out.println(name);
        return;
    }


    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String name = input.next();
     printmyName(name);

    }
}

//sum of two number
public class function {
    public static int addition(int num1,int num2 ) {
        int sum =  num1%num2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = addition(num1,num2);
        System.out.println(sum);

    }
}
*/
public class function {
    public static void printfactorial(int n) {
        if(n<0) {
            System.out.println("invalid statement");
            return;
        }

        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
    }
        System.out.println(fact);
            return;

        }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printfactorial(n);


    }
}

