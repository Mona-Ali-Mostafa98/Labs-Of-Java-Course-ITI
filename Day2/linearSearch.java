import java.util.Random;

class SearchOnMinMaxInArray {
    public static void main(String args[]) {
        int array[] = new int[1000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        // Linear Search
        long startTime = System.nanoTime();
        int min = findMinimum(array);
        int max = findMaximum(array);
        long endTime = System.nanoTime();
        long searchTime = endTime - startTime;

        System.out.println("Array Min: " + min);
        System.out.println("Array Max: " + max);
        System.out.println("Search Time: " + searchTime + " nanoseconds");
    }

    public static int findMinimum(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaximum(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
