import java.util.Arrays;
import java.util.Random;

class binarySearchOnMinMaxInArray{

    public static void main(String args[]) {
        int array[] = new int[1000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        // Sort the array for binary search
        Arrays.sort(array);

        // Binary Search
        long startTime = System.nanoTime();
        int min = array[0];
        int max = array[array.length - 1];
        long endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        System.out.println("\nBinary Search Results:");
        System.out.println("Array Min: " + min);
        System.out.println("Array Max: " + max);
        System.out.println("Binary Search Time: " + binarySearchTime + " nanoseconds");
    }
}
