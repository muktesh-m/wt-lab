/*1. WAP to accept a string from command line argument and do the following
a) length of the string
b) display the content of string character by character
c) convert the each character of a string from lower to upper and
vise versa */

import java.util.*;
public class q1 {
    public static void main(String[] args) {
        // Get the string from the command line argument
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        
        // Length of the string
        System.out.println("Length of the string: " + string.length());
        
        // Display the content of the string character by character
        System.out.println("Characters of the string:");
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            System.out.println(c);
        }
        
        // Convert each character of the string from lower to upper and vice versa
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                newString.append(Character.toLowerCase(c));
            } else {
                newString.append(Character.toUpperCase(c));
            }
        }
        System.out.println("String with characters converted from lower to upper and vice versa: " + newString.toString());
    }
}
