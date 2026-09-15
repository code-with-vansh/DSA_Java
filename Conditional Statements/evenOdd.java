import java.util.*;

public class evenOdd {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Even Odd Number Checker");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.printf("The number %d is Even", num);
        }
        else {
            System.out.printf("The number %d is Odd", num);
        }
    }
}
