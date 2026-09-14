import java.util.*;

public class areaCircle {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) {

        System.out.println("Circle area calculator");
        System.out.print("Enter the radius r of circle : ");
        float r = sc.nextFloat();

        // ! USE OF printf()
        float area = 3.14f * r * r;
        System.out.printf("Area of circle = %.2f", area);

    }
}