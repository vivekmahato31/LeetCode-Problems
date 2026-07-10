// Write a program to read the radius of a circle and print its area and circumference.
import java.util.*;

public class Radius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();

        double circumference = (2 * 3.14 * r);
        System.out.println("The Circumference is : " + circumference);

        double area = (3.14 * r * r);
        System.out.println("The Area is : " + area);

        sc.close();
    }    
}
