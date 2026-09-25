import java.util.*;

public class subarrays {

    public static Scanner sc = new Scanner(System.in);

    // ! Print all Subarrays
    public static void allSubarray(int arr[]) {
        System.out.println("Subarrays : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.printf("%d,", arr[k]);
                }
                System.out.print(")  ");
            }
            System.out.println();
        }
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
            System.out.println("Enter 1 : Print all Subarrays");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    allSubarray(arr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }

    }
}