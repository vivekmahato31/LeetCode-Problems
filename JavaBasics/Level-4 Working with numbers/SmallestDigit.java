// Write a program to find the Smallest digit in a number n

import java.util.Scanner;

public class SmallestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int smallest = 0;

        if (n == 0) {
            smallest = 0;
        } 
        else {
            while (n > 0) {
                
                int digit = n % 10;

                if (digit < smallest) {
                    smallest = digit;
                }

                n = n / 10;
            }
        }

        System.out.println("Smallest digit = " + smallest);

        sc.close();
    }
}
