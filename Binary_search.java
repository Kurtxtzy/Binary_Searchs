import java.util.Scanner;

/*
Description: This program accepts user input for an array and a target value,
             sorts the array in ascending order, and uses recursive binary
             search to find the index of the target.

Programmed by: <Duezel Kurt N. Dioso> <BSIT- 2nd Year> <48079> <CC104- Data Strcuture And Algorithm>

Last Modified: September 10, 2026

Version: 1.0

[Acknowledgements: Instructor-provided Binary Search program Through Canvas Midterm Module
and generative AI assistance(such as Cloude Ai).]
https://www.geeksforgeeks.org/dsa/how-to-do-binary-search-step-by-step/

*/

public class Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        // Base case
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // Display recursive call
        System.out.println("Call: low=" + low +
                           ", high=" + high +
                           ", mid=" + mid);

        System.out.println("Value: " + arr[mid]);

        // Target found
        if (arr[mid] == target) {
            System.out.println("Target found");
            return mid;
        }

        // Search left
        if (target < arr[mid]) {
            System.out.println("Search left");
            return bSearch(arr, target, low, mid - 1);
        }

        // Search right
        System.out.println("Search right");
        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.println();
        System.out.println("--- Recursive Trace ---");

        // Recursive binary search
        int result = bSearch(numbers, target, 0, numbers.length - 1);

        System.out.println("------------------------");

        // Display result
        if (result == -1) {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        } else {
            System.out.println("Target found.");
            System.out.println("Index: " + result);
        }

        sc.close();
    }
}
