
import java.util.Scanner;
public class MinMax {
    public static int findMin(int[] arr) {
        int min = arr[0];   
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];   

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        
        if (args.length > 0) {
            int[] numbers = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            System.out.println("From Command Line:");
            System.out.println("Minimum: " + findMin(numbers));
            System.out.println("Maximum: " + findMax(numbers));
        }
       Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("From Scanner:");
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));

        
        int[] result = findMinAndMax(arr);
        System.out.println("Using single method:");
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        sc.close();
    }
}