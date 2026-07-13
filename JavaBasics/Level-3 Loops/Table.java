//  Write a program to display the multiplication table of a number n.
import java.util.*;

public class Table {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        if ( n <= 0){
            System.out.println("The number should be greater than zero.");
        }
        else{
            System.out.println("The table of "+ n + " is: ");
            for( int i = 1; i <= 10; i++){
                int table = i * n;
                System.out.println(n + " x " + i + " = " + table);
            }
        }
        sc.close();
    }
}
