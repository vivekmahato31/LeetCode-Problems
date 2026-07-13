//  Write a program to display all numbers from 1 to n that are divisible by 3 or 5.

import java.util.Scanner;

   public class DivisibleBy3and5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int count = 0;

        if ( n <= 0){
            System.out.println("The number should be greater than zero.");
        }
        else{

            System.out.println("The numbers are: ");
            for( int i = 1; i <= n; i++){
                if( i % 3 == 0 || i % 5 == 0){
                    System.out.println(i);             
                    count +=1; 
                }    
            }
            System.out.println("There are " + count + " numbers from 1 to " + n + " are divisible by 3 and 5.");

        }
        sc.close();
    }
} 

