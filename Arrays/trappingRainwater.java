import java.util.*;

// Array : 3  0  1  0  4  0  3  0  2

public class trappingRainwater {

    public static Scanner sc = new Scanner(System.in);

    // ! Trapping Rain Water using Prefix Array
    public static void trappedRainwaterPrefixArray(int height[]) {
        int n = height.length;
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
        System.out.printf("Trapped Rain Water (Prefix Array) = %d", trappedWater);
        System.out.println();
    }

    // ! Trapping Rain Water using Two Pointer
    public static void trappedRainwaterTwoPointer(int height[]) {
        int n = height.length, trappedWater = 0;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax < rightMax) {
                trappedWater += leftMax - height[left];
                left++;
            } else {
                trappedWater += rightMax - height[right];
                right--;
            }
        }
        System.out.printf("Trapped Rain Water (Two Pointer) = %d", trappedWater);
        System.out.println();
    }

    public static void main(String[] args) {
        // ! MAIN FUNCTION

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

        while (true) {
            // * Display Array
            System.out.print("\nArray : ");
            for (int i = 0; i < height.length; i++) {
                System.out.print(height[i] + "  ");
            }
            System.err.println();
            System.out.println("Enter 1 : Trapped Rainwater (Prefix Array)");
            System.out.println("Enter 2 : Trapped Rainwater (Two Pointer)");
            System.out.println("Enter 0 : EXIT");
            System.out.print("Enter your Choise : ");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    trappedRainwaterPrefixArray(height);
                    break;
                case 2:
                    trappedRainwaterTwoPointer(height);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise !!!");
            }
        }

    }
}