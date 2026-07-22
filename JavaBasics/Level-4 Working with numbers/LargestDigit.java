// Write a program to find the largest digit in a number n

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largest = 0;

        System.out.println("Largest digit = " + largest);

        sc.close();
    }
}