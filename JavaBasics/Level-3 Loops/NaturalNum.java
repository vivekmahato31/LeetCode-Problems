// Write a program to display all the natural numbers from 1 to n. (n is user input).
import java.util.*;

public class NaturalNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        //edge case
        if(n < 0){
            System.out.println("Please enter a positive integer greater than 0."); 
        }
        else if( n == 0){
            System.out.println(n + " Is not a Natural Number.");
        }
        //edge case
        else{
                System.out.println("The all natural numbers for 1 to " + n + " are: ");
                for( int i = 1; i <= n ; i++){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
