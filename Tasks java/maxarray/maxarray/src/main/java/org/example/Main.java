package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        // new input from user
        Scanner scan =new Scanner(System.in);
        // initialize the size of arry
        int size;
        System.out.println("Enter the size of the array");
        // taking the size of the array from the user
        size = scan.nextInt();
        // initialize the array as a double
        double arr[]=new double[size];
        System.out.println("Enter the array numbers : ");
        // putting the numbers enters by the user in the array using loop
        for (int i=0 ; i<size ; i++ )  {
            arr[i]=scan.nextInt();
        }
        // using for loop to visit all array numbers
        for(int i=0 ; i<size ; i++) {
            // another loop to compare the every item of array with others
            for(int j=i+1 ; j<size ; j++) {
                // using if to compare which item is bigger
                if(arr[i]<arr[j])
                {
                    // initialize a temp variable
                    double temp = arr[i];
                    arr[i] = arr[j];
                    // when one is bigger we put it in the temp variable until we compare the others
                    arr[j] = temp;
                }
            }
        } System.out.println("Largest element in the array is " + arr[0] );
        }
}