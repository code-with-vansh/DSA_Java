import java.util.*;

public class factorialCalculator {

    public static Scanner sc = new Scanner(System.in);

    public static double factorial(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("Enter 1 : Factorial Calculator");
            System.out.println("Enter 0 : EXIT");

            System.out.print("Enter your choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    System.out.println("Factorial Calculator");
                    System.out.print("Enter a number : ");
                    int num = sc.nextInt();
                    System.out.printf("Factorial of %d is %.2f", num, factorial(num));
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choise !!!");
            }
            System.out.println();
            System.out.println();
        }

    }
}

