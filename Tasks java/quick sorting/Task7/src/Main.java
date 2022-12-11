import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner to take inputs from users
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        // initialize the size of array and taking it from user
        int size = scanner.nextInt();
        // initialize array and give it the size which user put
        int arr [] = new int[size];
        // for loop to store the value which enters by the user in the array
        System.out.println("Enter items of array");
        for (int i = 0 ; i < size ; i++){
            arr[i] = scanner.nextInt();
        }
        // printing the array before sorting and after sorting using functions
        System.out.println("The array before sorting :");
        displayArray(arr);
        System.out.println("The array after sorting :");
        System.out.println("");
        quick_sort(arr, 0, arr.length - 1);
        displayArray(arr);
    }

    // function called quick sort to sort the array
    public static void quick_sort(int [] array, int left, int right) {
        //comparing the left with the right and using quick_sort to sort it
        if (left < right) {
            int q = position(array, left, right);
            quick_sort(array, left, q-1);
            quick_sort(array, q+1, right);
        }
    }

    // 2 functions to swap the array with the way we need
    private static int position(int array [], int left, int right) {
        int i = left - 1;
        for (int j = left ; j < right ; j++) {
            if (array[j] < array[right]) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, right);
        return i+1;
    }
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // function to display the array after sorting 
    public static void displayArray(int [] nums){
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums [i] + " ");
        }
    }
}