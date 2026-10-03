import java.util.*;

public class sorting2 {

    public static Scanner sc = new Scanner(System.in);

    // ! Print Array
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.err.println();
    }

    // ! Inbuild Sort
    public static void inBuildSort(Integer arr[]) {
        Arrays.sort(arr); // * Arrays.sort(arr, startIndex, endIndex+1)
        System.out.print("Inbuild Sorted Array : ");
        printArray(arr);
    }

    // ! Inbuild Sort Descending
    public static void inBuildSortDesc(Integer arr[]) {
        // * Collections.reverseOrder() function works on objects that's why we are
        // using Integer Object
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Inbuild Sorted Array (Descending) : ");
        printArray(arr);
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("WELCOME IN THE WORLD OF Inbuid Sorting ARRAYS\n");
        // * Input length of Array from user
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];

        // * Input elements of Array from user
        System.out.print("Enter the elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            // * Display Array
            System.out.print("\nArray : ");
            printArray(arr);
            System.out.println("Enter 1 : Inbuild Sort");
            System.out.println("Enter 2 : Inbuild Sort Descending");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    inBuildSort(arr);
                    break;
                case 2:
                    inBuildSortDesc(arr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }
    }
}
