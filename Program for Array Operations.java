import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];  // Fixed-size array
        int size = 5; // Initial size
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Initial Array:");
        displayArray(arr, size);

        // Insert an element
        System.out.print("\nEnter element to insert: ");
        int newElement = sc.nextInt();
        if (size < arr.length) {
            arr[size] = newElement;
            size++;
        } else {
            System.out.println("Array is full!");
        }

        System.out.println("\nArray after insertion:");
        displayArray(arr, size);

        // Delete an element
        System.out.print("\nEnter element to delete: ");
        int deleteElement = sc.nextInt();
        size = deleteElement(arr, size, deleteElement);

        System.out.println("\nArray after deletion:");
        displayArray(arr, size);

        // Search for an element
        System.out.print("\nEnter element to search: ");
        int searchElement = sc.nextInt();
        int index = searchElement(arr, size, searchElement);
        if (index != -1)
            System.out.println(searchElement + " found at index " + index);
        else
            System.out.println(searchElement + " not found!");

        sc.close();
    }

    static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int deleteElement(int[] arr, int size, int element) {
        int index = searchElement(arr, size, element);
        if (index == -1) {
            System.out.println("Element not found!");
            return size;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return size - 1;
    }

    static int searchElement(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }
}
