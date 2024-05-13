
package Question5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers:");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Enter a number to search for:");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + searchNumber + " appears " + count + " times in the array.");
        } else {
            System.out.println("The number " + searchNumber + " isn't in the array.");
        }

        scanner.close();
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {

            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[middle + 1 + j];
        }
        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}

