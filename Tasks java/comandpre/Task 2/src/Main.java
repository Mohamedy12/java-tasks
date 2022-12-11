import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner to take inputs from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        // initialize n and taking it from user
        int n = scanner.nextInt();
        System.out.println("Enter value of r : ");
        // initialize r and taking it from user
        int r = scanner.nextInt();
        // initialize Combination and permutation
        int Combination = 1, permutation = 1;

        // printing the combination and permutation
        Combination = fact(n)/ (fact(r) * fact(n-r));
        System.out.println("the result of combination is: " + Combination);
        permutation = fact(n) / fact(n-r);
        System.out.println("the result of permutation is: " + permutation);
    }
    // function to cal the factourial
    public static int fact(int number){
        int z = 1;
        int j = 1;
        while(j <= number) {
            z = z * j;
            j++;
        }
        return z;
    }
}