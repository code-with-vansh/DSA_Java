import java.util.*;

public class binarySearch {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Program to search an element in Array using binary search");
        // ! Input length of Array from user
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // ! Input elements of Array from user
        System.out.printf("Enter %d elements of Sorted Array : ", n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ! Display Array
        System.out.print("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d  ", arr[i]);
        }

        // ! Input key from user to search in Array
        System.out.print("\n\nEnter key to search : ");
        int key = sc.nextInt();

        // ! Binary Search logic
        int index = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.printf("%d found at %dth position", key, index + 1);
        } else {
            System.out.printf("%d is NOT present in Array", key);
        }

    }
}
