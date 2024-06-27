import java.util.Scanner;

public class Main {
    public static void printArray(int array[]) {
        System.out.print("After Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int array[] = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Before Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Selection Sort
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        printArray(array);
    }
}
