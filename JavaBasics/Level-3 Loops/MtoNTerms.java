// Write a program to display all multiples of a number m up to n terms.
import java.util.*;

public class MtoNTerms {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        if ( n <= 0){
            System.out.println("The " + n + " should be greater than zero.");
        }
        else if ( m <= 0){
            System.out.println("The " + m + " should be greater than zero.");
        }
        else{
            System.out.println("All multiples of " + m + " up to " + n +" is: ");
            for( int i = 1; i <= n; i++){
                int table = i * m;
                System.out.println(m + " x " + i + " = " + table);
            }
        }
        sc.close();
    }
}

