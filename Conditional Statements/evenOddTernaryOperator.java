import java.util.*;

public class evenOddTernaryOperator {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Even Odd Checker using Ternary Operator");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // ! TERNARY OPERATOR
        String result = (num%2 == 0) ? "EVEN" : "ODD" ;
        System.out.printf("%d is an %s number", num, result);
    }
}
