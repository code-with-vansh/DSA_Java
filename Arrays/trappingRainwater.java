import java.util.Scanner;

public class trappingRainwater {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Program to calculate the amount of rainwater trapped between bars (length = width = 1)\n");
        // * Input length of Array from user
        System.out.print("Enter the length of Array (no of bars) : ");
        int n = sc.nextInt();
        int height[] = new int[n];

        // * Input elements of Array from user
        System.out.print("Enter the elements of Array (height of bars) : ");
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println();

        
        // Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int waterLevel = 0;
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            // find waterlevel = min of leftMax and rightMax
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trappedWater += waterLevel - height[i];
            trappedWater += waterLevel - height[i];
        }
        System.out.printf("Trapped Rain Water = %d units", trappedWater);
        System.out.println();
    }
}
