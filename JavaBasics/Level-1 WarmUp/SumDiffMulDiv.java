// Write a program to read two numbers and print their sum, difference, product and quotient.

import java.util.*;
public class SumDiffMulDiv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First no: ");
        double A = sc.nextInt();

        System.out.println("Enter your Second no: ");
        double B = sc.nextInt();

        System.out.println();

        double Sum = (A + B);
        double Diff = (A - B);
        double Mul = (A * B);
        double Div = (A / B);

        System.out.println("The sum of " + A + " and " + B + " is: " + Sum);
        System.out.println("The Difference of " + A + " and " + B + " is: " + Diff);
        System.out.println("The Product of " + A + " and " + B + " is: " + Mul);
        System.out.println("The Quotient of " + A + " and " + B + " is: " + Div);

        sc.close();  
    }
}
