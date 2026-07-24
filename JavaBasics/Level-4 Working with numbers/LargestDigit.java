// Write a program to find the largest digit in a number n

import java.util.Scanner;

public class LargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int largest = 0;

        if (n == 0) {
            largest = 0;
        } 
        else {
            while (n > 0) {
                
                int digit = n % 10;

                if (digit > largest) {
                    largest = digit;
                }

                n = n / 10;
            }
        }

        System.out.println("Largest digit = " + largest);

        sc.close();
    }
}