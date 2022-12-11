package org.example;

public class Main {
    public static void main(String[] args) {
        // initialize 2D array as integer and gave it a specific values
        int org[][]={{2,2,3},{5,6,1},{3,2,8}};
        System.out.println("The Matrix without transpose:");
        // two for loops for visiting each item on array
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                // printing the 2d array before transpose
                System.out.print(org[i][j]+" "); }
            System.out.println(); }
        System.out.println("The Matrix After Transpose:");
        // 2 for loops to make a transpose
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                // printing the 2d array after transpose 
                System.out.print(org[j][i]+" "); }
            System.out.println(); }
    }}
