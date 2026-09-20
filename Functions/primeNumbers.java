import java.util.*;

public class primeNumbers {

    public static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Prime Numbers in range 1 to n");
        System.out.print("Enter the range n : ");
        int n = sc.nextInt();

        if (n < 2 || n > 1000) {
            System.out.println("Invalid Range !!!");
            System.exit(0);
        }

        System.out.println();
        System.out.println("Prime Numbers are : ");

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (i < 10 && isPrime(i)) {
                System.out.printf("%d     ", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            } else if (i < 100 && isPrime(i)) {
                System.out.printf("%d    ", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            } else if (i < 1000 && isPrime(i)) {
                System.out.printf("%d   ", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
