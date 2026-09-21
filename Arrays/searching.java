import java.util.*;

public class searching {

    public static Scanner sc = new Scanner(System.in);

    // ! Linear Search Function
    public static void linearSearch(int arr[]) {
        // * Input key from user to search in Array
        System.out.print("Enter key to search : ");
        int key = sc.nextInt();

        // * Linear Search logic
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.printf("%d found at %dth position", key, position);
        } else {
            System.out.printf("%d is NOT present in Array", key);
        }
        System.out.println();
    }

    // ! Min Max Finder Function
    public static void minMaxFinder(int arr[]) {
        int min = arr[0], min2 = arr[0];
        int max = arr[0], max2 = arr[0];
        // * Find min and max value element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            }
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
        }

        // * Display min and max value element
        System.out.println("First  Min Value : " + min);
        System.out.println("Second Min Value : " + min2);

        System.out.println("First  Max Value : " + max);
        System.out.println("Second Max Value : " + max2);
    }

    // ! Reverse Array Function
    public static void reverseArray(int arr[]) {
        System.out.print("    Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        // * Reverse Array Logic
        int n = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.print("\nNow Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d  ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // ! MAIN FUNCTION

        System.out.println();
        System.out.println("WELCOME IN THE WORLD OF ARRAYS\n");
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
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
            System.err.println();
            System.out.println("Enter 1 : Linear Search");
            System.out.println("Enter 2 : Min Max Found");
            System.out.println("Enter 3 : Reverse Array");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    linearSearch(arr);
                    break;
                case 2:
                    minMaxFinder(arr);
                    break;
                case 3:
                    reverseArray(arr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }

    }
}
