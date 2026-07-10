// Write a program to swap two numbers without using a third variable.

import java.util.*;

public class Swap2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swaping");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping ");
        System.out.println( a);
        System.out.println( b);

        sc.close();
    }
}
