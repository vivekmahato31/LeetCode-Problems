// Write a program to read seconds and convert them into hours, minutes and seconds.

import java.util.*;
public class Time {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int S = sc.nextInt();

        int hour = S / 3600;
        int remainingSeconds = S % 3600;
        int minute = remainingSeconds / 60;
        int second = remainingSeconds % 60;
        
    
        System.out.println("There are "+ hour + " Hours "+ minute + " Minutes and " + second + " Seconds");

        sc.close();
    }
}
