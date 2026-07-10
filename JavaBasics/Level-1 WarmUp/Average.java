// Write a program to read the marks of 5 subjects and print the total and average.
import java.util.*;
public class Average {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Marks Of Maths: ");
    double Maths = sc.nextDouble();
    System.out.println("Enter Marks Of Science: ");
    double Science = sc.nextDouble();
    System.out.println("Enter Marks Of English: ");
    double English = sc.nextDouble();
    System.out.println("Enter Marks Of Hindi: ");
    double Hindi = sc.nextDouble();
    System.out.println("Enter Marks Of SocialScience: ");
    double SocialScience = sc.nextDouble();

    double TotalMarks = (Maths + Science + English + Hindi + SocialScience);
    System.out.println("The Toatal Marks is: "+ TotalMarks);

    double Average = TotalMarks/5;
    System.out.println("The Average Marks is: "+ Average);

    sc.close();
    }
}
