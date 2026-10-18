import java.util.Arrays;
import java.util.Random;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int dataSize = 1000;
        int[] arr = new int[dataSize];
        Random random = new Random();

        for (int i = 0; i < dataSize; i++) {
            arr[i] = random.nextInt(10000);
        }

        long startTime = System.nanoTime();

        // Insertion Sort Logic
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Insertion Sort Execution Time: " + timeMs + " ms");
    }
}
