package Question1;

//Question 1
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a sequence of numbers:");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }

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
}

