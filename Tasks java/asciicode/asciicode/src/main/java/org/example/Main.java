package org.example;
import java.util.Scanner;

//This program giving the character by entering the ASCII code for it

public class Main
{
    public static void main(String[] args)

    { System.out.println("Enter the ASCII value for the character : " );
        Scanner scan = new Scanner(System.in);
        // taking the ASCII value from User in a variable (val)
        int val = scan.nextInt();
        // defining the output as a character type (ch1)
        char ch1 = (char)val ;
        // Printing the character of the entered ASCII value
        System.out.println("The Character is : " + ch1);
    }
}