// Write a program to display all even numbers from 1 to n.

import java.util.*;

public class Even {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Please enter a positive integer greater than 0."); 
        }
        else if(n == 0){
            System.out.println("Please enter integer greater than 0."); 
        }
        else{
            System.out.println("All even number from 1 to " + n + " are: ");
            
            for ( int i = 1; i <= n ; i++ ){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }
        }
        sc.close();
    }
}
