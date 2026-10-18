import java.util.Arrays;
import java.util.Random;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int dataSize = 1000;
        int[] arr = new int[dataSize];
        Random random = new Random();

        for (int i = 0; i < dataSize; i++) {
            arr[i] = random.nextInt(10000);
        }

        long startTime = System.nanoTime();

        // Bubble Sort Logic
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Bubble Sort Execution Time: " + timeMs + " ms");
    }
}
