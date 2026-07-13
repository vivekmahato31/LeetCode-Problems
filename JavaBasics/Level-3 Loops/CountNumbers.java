// Write a program to count how many numbers from 1 to n are divisible by 3.
import java.util.*;

public class CountNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int count = 0;

        if ( n <= 0){
            System.out.println("The number should be greater than zero.");
        }
        else{

            System.out.println("The numbers are: ");
            for( int i = 3; i <= n; i+= 3){
                System.out.println(i);             
                count +=1;   
            }
            System.out.println("There are " + count + " numbers from 1 to " + n + " are divisible by 3.");

        }
        sc.close();
    }
}

