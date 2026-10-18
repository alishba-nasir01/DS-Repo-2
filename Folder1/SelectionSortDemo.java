import java.util.Arrays;
import java.util.Random;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int dataSize = 1000;
        int[] arr = new int[dataSize];
        Random random = new Random();

        for (int i = 0; i < dataSize; i++) {
            arr[i] = random.nextInt(10000);
        }

        long startTime = System.nanoTime();

        // Selection Sort Logic
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Selection Sort Execution Time: " + timeMs + " ms");
    }
}
