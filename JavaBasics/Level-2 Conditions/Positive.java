// Write a program to read a number and check whether it is positive, negative or zero.

import java.util.*;

public class Positive {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int num = sc.nextInt();

        if( num == 0){
            System.out.println("The number is Zero.");
        }
        else if ( num > 0){
            System.out.println("The number is Positive.");
        }
        else{
            System.out.println("The number is Negative.");
        }

        sc.close();
    }
}  
