import java.util.*;

public class pairsInArray {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Program to print Pairs in Array");
        // ! Input length of Array from user
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // ! Input elements of Array from user
        System.out.print("Enter the elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ! Display Array
        System.out.print("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        // ! Pairs in Array Logic
        System.out.println("\nPairs in Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                System.out.printf("(%d,%d)   ", arr[i], arr[j]);
            }
            System.out.println();
        }
    }
}
