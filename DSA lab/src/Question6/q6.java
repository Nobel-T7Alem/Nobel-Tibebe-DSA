package Question6;
public class ArrayOperations {

    public static int[] deleteElement(int[] array, int index) {

        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }

        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        System.out.println("Original array:");
        printArray(array);

        array = deleteElement(array, 2);
        System.out.println("Modified array after deleting element at index 2:");
        printArray(array);

        array = deleteElement(array, 5);
        System.out.println("Attempt to modify array with invalid index:");
        printArray(array);
    }
}
