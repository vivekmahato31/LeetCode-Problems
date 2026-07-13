//  Write a program to find the product of all natural numbers from 1 to n (factorial of n).

import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int fact = 1;

        if( n == 0 && n == 1){
            System.out.println("1");
        }
        else if( n < 0){
            System.out.println("Factorial is not defined for negative number");
        }
        else {
            System.out.println("The product of all natural numbers from 1 to " + n + " are: ");
            for(int i = n; i >= 1; i--){
                fact = fact * i;
            }
            System.out.println(fact);
        }
        sc.close();
    }
}
