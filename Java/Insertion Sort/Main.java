import java.util.Scanner;

public class Main {

    public static void printSortedArray(int array[]) {
        System.out.print("After Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int array[] = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Before Sorting: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            // Insertion sort
            for (int i = 1; i < array.length; i++) {
                int currentElement = array[i];
                int j = i - 1;

                while (j >= 0 && currentElement < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = currentElement;
            }

            printSortedArray(array);
        }
    }

}
