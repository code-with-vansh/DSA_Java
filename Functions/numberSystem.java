import java.util.*;

public class numberSystem {

    public static Scanner sc = new Scanner(System.in);

    public static void dec_to_bin() {
        System.out.print("Enter a Decimal Number : ");
        int num = sc.nextInt();

        int bin = 0, pow = 1, digit;
        while (num > 0) {
            digit = num % 2;
            bin = bin + digit * pow;
            pow = pow * 10;
            num = num / 2;
        }
        System.out.printf("Binary Number : %d", bin);
    }

    public static void bin_to_dec() {
        System.out.print("Enter a Binary Number : ");
        int bin = sc.nextInt();

        if (!checkBinary(bin)) {
            System.out.println("The number you entered is not binary");
            System.out.println("Binary number contain only 0 and 1");
            return;
        }
        int num = 0, pow = 1, digit;
        while (bin > 0) {
            digit = bin % 10;
            num = num + digit * pow;
            pow = pow * 2;
            bin = bin / 10;
        }
        System.out.printf("Decimal Number : %d", num);
    }

    public static boolean checkBinary(int n) {
        while (n > 0) {
            if (n % 10 != 0 && n % 10 != 1) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println();
            System.out.println("WELCOME IN THE WORLD OF NUMBERS");
            System.out.println("Enter 1 : Decimal To Binary Converter");
            System.out.println("Enter 2 : Binary To Decimal Converter");
            System.out.println("Enter 0 : EXIT");

            System.out.print("Enter your choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    dec_to_bin();
                    break;
                case 2:
                    bin_to_dec();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
            System.out.println();
        }
    }
}
