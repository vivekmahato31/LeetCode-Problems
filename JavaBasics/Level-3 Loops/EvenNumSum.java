// Write a program to find the sum of all even numbers from 1 to n.
import java.util.*;

public class EvenNumSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        
        if (n <= 0) {
            System.out.println("The number should be greater than zero.");
        }
        else {
            System.out.println("The Sum of all even numbers from 1 to " + n + " are: ");
            for (int i = 0; i <= n; i += 2){
                    sum += i;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}

