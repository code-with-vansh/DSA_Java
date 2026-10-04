import java.util.*;
/*  Array :
11 12 13 14 15 16 17 18 19 20
21 22 23 24 25 26 27 28 29 30
31 32 33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48 49 50
51 52 53 54 55 56 57 58 59 60
*/

public class array2D {

    public static Scanner sc = new Scanner(System.in);

    // ! Print Array
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.err.println();
    }

    // ! Spiral Matrix
    public static void spiralMatrix(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {

            // * Traverse top row: left -> right
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + "  ");
            }
            top++;

            // * Traverse right column: top -> bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + "  ");
            }
            right--;

            // * Traverse bottom row: right -> left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + "  ");
                }
                bottom--;
            }

            // * Traverse left column: bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + "  ");
                }
                left++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ! MAIN FUNCTION

        System.out.println();
        System.out.println("WELCOME IN THE WORLD OF 2D ARRAYS\n");
        // * Input length of Array from user
        System.out.print("Enter no of rows and columns in Array (m n): ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        // * Input elements of Array from user
        System.out.printf("Enter the elements of Array (%d * %d) : \n", m, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Row %d : ", i + 1);
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        while (true) {
            // * Display Array
            System.out.println("\nArray : ");
            printArray(arr);
            System.out.println("Enter 1 : Spiral Matrix");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    spiralMatrix(arr);
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }

    }
}