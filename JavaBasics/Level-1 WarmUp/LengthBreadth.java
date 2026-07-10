// Write a program to read the length and breadth of a rectangle and print its area and perimeter.

import java.util.*;
public class LengthBreadth {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        double length = sc.nextDouble();

        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();

        double perimeter = (2 * (length * breadth));
        System.out.println("The Perimeter is: " + perimeter);

        double area = (length * breadth);
        System.out.println("The Area is: " + area);

        sc.close();
    }  
}
