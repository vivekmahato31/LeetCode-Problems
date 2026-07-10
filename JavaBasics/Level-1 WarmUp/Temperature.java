// Write a program to read a temperature in Celsius and convert it to Fahrenheit.

import java.util.*;
public class Temperature {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperature in Celsius: ");
    double C = sc.nextDouble();

    double F = (C * 9/5) + 32;
    System.out.println("The temperature is: " + F + "°F");
    
    sc.close();
   } 
}
