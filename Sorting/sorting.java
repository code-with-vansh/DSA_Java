import java.util.*;
// Array : 2 1 3 5 4

public class sorting {

    public static Scanner sc = new Scanner(System.in);

    // ! Print Array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.err.println();
    }

    // ! Bubble Sort
    public static void bubbleSort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted array : ");
        printArray(arr);
    }

    // ! Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println("Selection Sorted array : ");
        printArray(arr);
    }

    public static void main(String[] args) {
        // ! MAIN FUNCTION

        System.out.println();
        System.out.println("WELCOME IN THE WORLD OF Sorting ARRAYS\n");
        // * Input length of Array from user
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // * Input elements of Array from user
        System.out.print("Enter the elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            // * Display Array
            System.out.print("\nArray : ");
            printArray(arr);
            System.out.println("Enter 1 : Bubble Sort");
            System.out.println("Enter 2 : Selection Sort");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    bubbleSort(arr);
                    break;
                case 2:
                    selectionSort(arr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }

    }
}