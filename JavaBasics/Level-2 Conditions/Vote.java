// Write a program to read the age of a person and check whether they are eligible to vote.

import java.util.*;
public class Vote {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        if (age < 0){
            System.out.println("Invalid Age! Please Check Your Input.");
        }
        else if (age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are Not eligible to vote.");
        }
        sc.close();
    }
}
