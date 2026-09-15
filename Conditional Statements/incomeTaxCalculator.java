import java.util.*;

public class incomeTaxCalculator {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main (String arg[]) {
        System.out.println("Income Tax Calculator");
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income <1000000) {
            tax = income * 2 / 100;
        }
        else {
            tax = income * 3 / 100;
        }

        System.out.printf("\nThe Tax on your %d income is %d", income, tax);

    }
}
