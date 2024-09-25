import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) * 2 + 1;
        }


        printArray(array);


        Arrays.sort(array);
        System.out.println("\nОтсортированный массив:");
        printArray(array);


        double average = Arrays.stream(array).average().orElse(0);
        System.out.println("\nСреднее арифметическое: " + average);
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
