package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // New input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        // initialize a variable called str with data type sting
        String str ;
        // taking str from the user
        str = scan.nextLine();
        // using replacement to replace every comma with space
        str = str.replaceAll(",","");
        // printing the string without any comma 
                System.out.println("The String Without a comma is : "+ str);
    }}
