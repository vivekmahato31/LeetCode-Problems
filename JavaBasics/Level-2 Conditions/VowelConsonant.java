// Write a program to read a character and check whether it is a vowel or a consonant.

import java.util.*;
public class VowelConsonant {
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character: ");
        char input = sc.next().charAt(0);
        char ch = Character.toLowerCase(input);

        if(ch < 'a' || ch > 'z'){
            System.out.println("Invalid Input");
        }
        else if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' ){
            System.out.println("This is vowel");
        }
        else {
            System.out.println("This is Consonent");
        }
        sc.close();
    }
}