//  Write a program to find the sum of all natural numbers from 1 to n.

import java.util.*;

public class NaturalNumSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        //edge case
        if(n < 0){
            System.out.println("Please enter a positive integer greater than 0."); 
        }
        else if( n == 0){
            System.out.println(n + " is not a Natural Number.");
        }
        //edge case
        else{
            System.out.println("The sum of all natural numbers for 1 to " + n + " are: ");

        for(int i = 1; i <= n ; i++){
            sum = sum + i;
            }
            System.out.println(sum);
        }
        
        sc.close();
    }
}

