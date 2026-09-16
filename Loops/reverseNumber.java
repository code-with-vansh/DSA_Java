import java.util.*;

public class reverseNumber {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Number Reverser");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int rev = 0, digit;

        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.printf("Reverse Number : %d", rev);
    }
}
