/*Write a program to read a character and check whether it is an alphabet, digit or special
symbol.*/

import java.util.*;

public class CharacterCheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character: ");
        char input = sc.next().charAt(0);
        char ch = Character.toLowerCase(input);

        
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Character is a Alphabet.");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println("Character is a Digit.");
        }
        else{
            System.out.println("Character is a Special Symbol.");
        }
        sc.close();
    }
}
