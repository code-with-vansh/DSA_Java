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

    public static void main(String[] args) {

        while (true) {

            System.out.println("WELCOME IN PATTERNS WORLD");
            System.out.println("Enter 1 : Floyds Triangle Pattern");
            System.out.println("Enter 0 : EXIT");

            System.out.print("Enter your choise : ");
            int choise = sc.nextInt();

            int n = 5;
            System.out.println();

            switch (choise) {
                case 1:
                    floyds_triangle_pattern(n);
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
