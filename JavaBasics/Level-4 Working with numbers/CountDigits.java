//  Write a program to count the number of digits in a number n.

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int count = 0;

        // Edge Case 
        if (n == 0) {
            System.out.println("The number of digits is: 1");
        }
        // Edge Case 
        else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
            System.out.println("The number of digits is: " + count);

        }
        sc.close();
    }
}
