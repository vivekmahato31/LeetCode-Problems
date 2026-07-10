// Write a program to swap two numbers using a third variable.

import java.util.*;
public class Swap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no A: ");
        int a = sc.nextInt();
        System.out.println("Enter second no B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping ");
        System.out.println();
        System.out.println("The First no A: " + a);
        System.out.println("The Second no B: " + b);

        
    }
}
