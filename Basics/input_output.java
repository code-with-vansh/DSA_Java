import java.util.*;

public class input_output {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) {

        System.out.println("Hello World.");
        System.out.println("What is your name??");
        String name = sc.nextLine();
        System.out.print("Hello " + name);
    }
}