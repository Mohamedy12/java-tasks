package org.example;
import java.util.Scanner;

// program to calculate the Area and Circumference for Circle and Triangle
public class Main {
    public static void main(String[] args) {

        // make the user choose which shape he wants to make calculations on it
        System.out.println("Select your Choice  :-" + "\n" + "(1)Circle" + "\n" + "(2)Triangle" );
        Scanner scan = new Scanner(System.in);
        int Choice;
        Choice = scan.nextInt();

        switch (Choice) {
            case 1 -> {   // Circle
                // asking the user which he wants to calculate (Area or Circumference)
                System.out.println("Which opreation do you want  :-" + "\n" + "(1)Area " + "\n" + "(2)Circumference" );
                int Num = scan.nextInt();

                switch (Num) {
                    case 1: // Area

                        System.out.println("Enter radius of circle: ");
                        Double rad = scan.nextDouble(); // taking the radius of the circle from the user in a variable called rad
                        // printing the area by passing rad to method of calculating the area of circle in the class of Shapes
                        System.out.println("The area is " + Shapes.calAreaOfCir(rad) + " cm^2");
                        break;

                    case 2: // Circumference

                        System.out.println("Enter radius of circle: ");
                        Double rad2 = scan.nextDouble();// taking the radius of the circle from the user in a variable called rad
                        // printing the area by passing rad to method of calculating the circumference of circle in the class of Shapes
                        System.out.println("The Circumference is "  + Shapes.calcircumferenceOfCir(rad2) + " cm");
                        break;
                    default:
                        // if he entered anything other else 1 or 2 this massage will appear for him
                        System.out.println("Invalid Choice");
                }
            }
            case 2 -> {  // Triangle


                System.out.println("Which opreation do you want  :-" + "\n" + "(1)Area " + "\n" + "(2)Circumference" );
                int Num2 = scan.nextInt();
                switch (Num2) {
                    case 1: // Area

                        System.out.println("Enter the height of triangle : ");
                        Double height = scan.nextDouble();  // taking the height of the triangle from the user in a variable called height
                        System.out.println("Enter the base length of triangle : ");
                        Double base = scan.nextDouble();   // taking the base length of the triangle from the user in a variable called base
                        /* printing the area by passing the height and the base length to method of calculating the area of triangle in the
                         class of Shapes */
                        System.out.println("The area is " + Shapes.calAreaOfTri(height,base) + " cm^2");
                        break;

                    case 2: // Circumference

                        System.out.println("Enter the sides of triangle : ");
                        // taking the Sides length of the triangle from the user in a variables called s1 and s2 and s3
                        Double s1= scan.nextDouble();
                        Double s2= scan.nextDouble();
                        Double s3= scan.nextDouble();
                        /* printing the circumference by passing the height and the base length to method of calculating the circumference
                         of triangle in the class of Shapes */
                        System.out.println("The area is Circumference " + Shapes.calcircumferenceOfTri(s1,s2,s3) + " cm");
                        break;
                    // if he entered anything other else 1 or 2 this massage will appear for him
                    default:
                        System.out.println("Invalid Choice");
                }

            }
    }
}}