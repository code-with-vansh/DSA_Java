import java.util.*;

public class calculator {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Simple Calculator with operations + - * / %");

        System.out.print("Enter A : ");
        float a = sc.nextFloat();
        System.out.print("Enter Operator(+,-,*,/,%) : ");
        char ch = sc.next().charAt(0);
        // ! USE charAt() to extract character from word
        System.out.print("Enter B : ");
        float b = sc.nextFloat();

        float result = -1;

        switch (ch) {
            // ! USE '+' FOR CHARACTER BECAUSE "+" IS STRING
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                if (b==0) {
                    System.out.println("ERROR: Division by Zero");
                } else {
                    result = a/b;
                }
                break;
            case '%':
                if (b==0) {
                    System.out.println("ERROR: Division by Zero");
                } else {
                    result = a%b;
                }
                break;
        
            default:
                System.out.println("Invalid Operator !!!");
                break;
        }

        if (result != -1) {
            System.out.printf("\nOutput: %.2f %c %.2f = %.2f", a, ch, b, result);
        }

    }
}
