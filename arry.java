package com.learn.java;

/*public class arry {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+"\n");
        }
    }
}*/

/*import java.util.*; name print
public class arry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        name[0] = input.nextLine();
        for(int i=0;i < name.length;i++)
        System.out.println(name[i]+"");
    }
}

import java.util.*;
public class arry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int name[] = new int[3];
        name[0] = input.nextInt();
        name[1] = input.nextInt();
        name[2] = input.nextInt();
        name[3] = input.nextInt();
        for (int i = 0; i < name.length ; i++)
            System.out.println(name[i] + "");
    }
}
////////////////////////////////////2Darrays
import java.util.*;
public class arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int name[][] = new int[5][5];
        name[0][0] = sc.nextInt();
        name[0][1] = sc.nextInt();
        name[0][2] = sc.nextInt();
        for(int i = 0; i < name.length; i++)
            for (int j = 0; j < name[i].length; j++)
                System.out.println(name[i][j] + "");
    }
}*/
//3d array
import java.util.*;
public class arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int name[][][] = new int[5][5][6];
        name[0][0][9] = sc.nextInt();
        name[0][1][9] = sc.nextInt();
        name[0][2][9] = sc.nextInt();
        for(int i = 0; i < name[i].length; i++)
            for (int j = 0; j < name[j].length; j++)
                for (int k = 0; k < name[k].length; k++)
                System.out.println(name[i][j][k] + "");
    }
}

