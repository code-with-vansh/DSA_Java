import java.util.*;

public class maxProfitStock {

    public static Scanner sc = new Scanner(System.in);

    // ! Max Profit in Stock Trading using Blute Force
    public static void maxProfitBluteForce(int arr[]) {
        int sp = 0, bp = 0, profit = 0;
        int info[] = new int[3];
        info[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            bp = arr[i];
            for (int j = i; j < arr.length; j++) {
                sp = arr[j];
                profit = sp - bp;
                if (profit > info[0]) {
                    info[0] = profit;
                    info[1] = i;
                    info[2] = j;
                }
            }
        }
        System.out.printf("Buy  : Day %d  -> $%d \n", info[1] + 1, arr[info[1]]);
        System.out.printf("Sell : Day %d  -> $%d \n", info[2] + 1, arr[info[2]]);
        System.out.printf("Maximum Profit -> $%d \n", info[0]);
    }

    // ! Max Profit in Stock Trading Vansh's Approach
    public static void maxProfitVansh(int arr[]) {
        int bp = arr[0], sp, profit;
        int info[] = new int[3];
        info[0] = 0; // maxProfit
        for (int i = 1; i < arr.length; i++) {
            sp = arr[i];
            if (arr[i - 1] <= bp) {
                bp = arr[i - 1];
                info[1] = i - 1;
            }
            profit = sp - bp;
            if (profit > info[0]) {
                info[0] = profit;
                info[2] = i;
            }

        }
        System.out.printf("Buy  : Day %d  -> $%d \n", info[1] + 1, arr[info[1]]);
        System.out.printf("Sell : Day %d  -> $%d \n", info[2] + 1, arr[info[2]]);
        System.out.printf("Maximum Profit -> $%d \n", info[0]);
    }

    public static void main(String[] args) {
        // ! MAIN FUNCTION

        System.out.println();
        System.out.println("Program to Calculate Max Profit in Stock Trading\n");
        // * Input length of Array from user
        System.out.print("Enter the length of Array (no of days) : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // * Input elements of Array from user
        System.out.print("Enter the elements of Array (Stock Price) : ");
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
            System.out.println("Enter 1 : Max Profit Stock Trading (Blute Force)");
            System.out.println("Enter 2 : Max Profit Stock Trading (Vansh's Approach)");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    maxProfitBluteForce(arr);
                    break;
                case 2:
                    maxProfitVansh(arr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }

    }
}