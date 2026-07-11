// Write a program to read a number and check whether it is divisible by both 3 and 5.

import java.util.*;

public class Divisible {
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int num = sc.nextInt(); 

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("The number "+ num + " is divisible by both 3 and 5.");
        }
        else{
            System.out.println("The number "+ num + " is not divisible by both 3 and 5.");
        }
        sc.close();
    }
}
