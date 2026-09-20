import java.util.*;

public class incomeTaxCalculator {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) {
        System.out.println("Income Tax Calculator");
        System.out.print("Enter your income (lakh per annum) : ");
        float income = sc.nextFloat();
        int tax;

        if (income < 5) {
            System.out.print("Income tax (0%) = 0");
        } else if (income >= 5 && income < 10) {
            tax = (int) (income * 20000);
            // ! USE %% WHEN USE printf()
            System.out.printf("Income tax (20%%) = %d", tax);
        } else {
            tax = (int) (income * 30000);
            System.out.printf("Income tax (30%%) = %d", tax);
        }

    }
}
