// Write a program to find the product of all digits of a number n.

import java.util.*;

public class ProductOfDigits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n =sc.nextInt();
        int original = n;
        n = Math.abs(n);
        int product = 1 ;

        if ( n == 0){
            System.out.println("The Product of all digits of a number "+ original + " is: ");
            System.out.println(0);
        }
        else {
                System.out.println("The Product of all digits of a number "+ original + " is: ");
            while ( n > 0){
                int digit = n % 10;
                n = n/10;
                product = product * digit;
            }
            System.out.println(product);
        }
        sc.close();
    }   
}

