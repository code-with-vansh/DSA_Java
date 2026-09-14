import java.util.*;

public class product {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) {

        System.out.println("Product of a & b");

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        int product = a * b;

        System.out.print(a + " * " + b + " = " + product);

    }
}
