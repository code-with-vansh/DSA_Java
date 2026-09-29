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
        System.out.println("Bubble Sorted Array : ");
        printArray(arr);
    }

    // ! Bubble Sort - Descending

    public static void bubbleSortDesc(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted Array (Descending) : ");
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
        System.out.println("Selection Sorted Array : ");
        printArray(arr);
    }

    // ! Selection Sort - Descending

    public static void selectionSortDesc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxPos]) {
                    maxPos = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
        System.out.println("Selection Sorted Array (Descending) : ");
        printArray(arr);
    }

    // ! Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;

            // Shift larger elements one position to the right
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at its correct position
            arr[j + 1] = curr;
        }
        System.out.println("Insertion Sorted Array : ");
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
            System.out.println("Enter 2 : Bubble Sort Descending");
            System.out.println("Enter 3 : Selection Sort");
            System.out.println("Enter 4 : Selection Sort Descending");
            System.out.println("Enter 5 : Insertion Sort");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    bubbleSort(arr);
                    break;
                case 2:
                    bubbleSortDesc(arr);
                    break;
                case 3:
                    selectionSort(arr);
                    break;
                case 4:
                    selectionSortDesc(arr);
                    break;
                case 5:
                    insertionSort(arr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }

    }
}