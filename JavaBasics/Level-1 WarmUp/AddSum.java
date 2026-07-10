import java.util.*;

public class AddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int A = sc.nextInt();

        System.out.println("Enter first Number: ");
        int B = sc.nextInt();

        int sum = A + B;
        System.out.println("The Sum of " + A + " and " + B + " is: " + sum  );

        sc.close();
    }
}
