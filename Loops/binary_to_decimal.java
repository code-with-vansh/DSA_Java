import java.util.*;

public class binary_to_decimal {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Binary to Decimal converter");
        System.out.print("Enter a Binary number : ");
        int bin = sc.nextInt();

        int num = 0, digit, power=1;

        while (bin>0) {
            digit = bin % 10;
            num = num + digit * power;
            power = power * 2;
            bin = bin / 10;
        }

        System.out.printf("Decimal Number : %d", num);
    }
}
