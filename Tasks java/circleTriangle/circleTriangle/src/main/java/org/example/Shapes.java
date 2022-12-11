package org.example;

// defining a new class called (Shapes)
public class Shapes {

// method to calculate the area of the circle and defining the radius of the circle as double
        public static Double calAreaOfCir(Double radius) {

            // it will return the area of the circle from (Area = pi * radius^2)
            return ((3.14) * radius * radius) ;

    }

// method to calculate the circumference of the circle and defining the radius of the circle as double
         public static Double calcircumferenceOfCir(Double radius) {

            // it will return the circumference of the circle from (Circumference = 2 * pi * radius)
            return ((3.14) * radius * 2) ;

    }

// method to calculate the area of the triangle and defining the height and base length of the triangle as double
          public static Double calAreaOfTri(Double height , Double base) {

            // it will return the area of the triangle from (Area = 0.5 * height * base length)
            return ((0.5) * base * height) ;

    }

// method to calculate the circumference of the triangle and defining the Sides of the triangle as double

    public static Double calcircumferenceOfTri( Double side1 , Double side2 , Double side3 ) {

            // it will return the circumference of the triangle from (Circumference = side1 +side2 +side3)
            return (side1 + side2 + side3);
    }
}