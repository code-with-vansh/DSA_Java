import java.util.*;

public class checkPrime {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Prime Number Checker");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean prime = true;

        if (num<2) {
            prime = false;
        }
        else if (num>2) {
            for (int i = 2; i*i <= num; i++) {
                if (num%i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        String result = (prime) ? "a Prime" : "NOT a Prime" ;

        System.out.printf("%d is %s number", num, result);
    }
}
