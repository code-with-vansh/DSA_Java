import java.util.*;

public class decimal_to_binary {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Decimal to Binary converter");
        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();

        int bin = 0, digit, power=1;

        while (num>0) {
            digit = num % 2;
            bin = bin + digit * power;
            power = power * 10;
            num = num / 2;
        }

        System.out.printf("Binary Number : %d", bin);
    }
}
