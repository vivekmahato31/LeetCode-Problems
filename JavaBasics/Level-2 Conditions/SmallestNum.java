// Write a program to read three numbers and find the smallest among them.

import java.util.*;

public class SmallestNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int A = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int B = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int C = sc.nextInt();

        if(A == B && B == C){
            System.out.println("All numbers are Equal.");
        }
        else if (A <= B && A <= C){
            System.out.println(A + " is Smallest.");
        } 
        else if(B <= A && B <= C){
            System.out.println(B + " is Smallest.");
        }
        else {
            System.out.println(C + " is Smallest.");
        sc.close();
        }
    }

}