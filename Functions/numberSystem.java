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


    public static void main(String[] args) {

        while (true) {

            System.out.println();
            System.out.println("WELCOME IN THE WORLD OF NUMBERS");
            System.out.println("Enter 1 : Decimal To Binary Converter");
            System.out.println("Enter 0 : EXIT");

            System.out.print("Enter your choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    dec_to_bin();
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