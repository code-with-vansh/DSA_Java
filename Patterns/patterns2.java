import java.util.*;

public class patterns2 {

    public static Scanner sc = new Scanner(System.in);

    public static void floyds_triangle_pattern(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle_0_1_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n) {
        // for upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // for lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("WELCOME IN PATTERNS WORLD");
            System.out.println("Enter 1 : Floyds Triangle Pattern");
            System.out.println("Enter 2 : 0-1 Triangle Pattern");
            System.out.println("Enter 3 : Butterfly Pattern");
            System.out.println("Enter 0 : EXIT");

            System.out.print("Enter your choise : ");
            int choise = sc.nextInt();

            int n = 5;
            System.out.println();

            switch (choise) {
                case 1:
                    floyds_triangle_pattern(n);
                    break;
                case 2:
                    triangle_0_1_pattern(n);
                    break;
                case 3:
                    butterfly_pattern(n);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choise !!!");
            }
            System.out.println();
        }
    }
}
