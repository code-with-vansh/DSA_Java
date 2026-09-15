import java.util.*;

public class largestNumber {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main (String arg[]) {

        System.out.println("Largest Number among three numbers");
        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of C : ");
        int c = sc.nextInt();
        int largest;
        
        if (a>b) {
            if (a>c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b>c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.printf("The Largest Number among %d, %d and %d is %d", a, b, c, largest);

    }
}
