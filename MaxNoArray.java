public class MaxNoArray {
    public static void main(String[] args) {
        int[] numbers = {11, 23, 6, 9, 21};
        int max = findMax(numbers);
        System.out.println("Maximum number in the array is " + max);
    }

    public static int findMax(int[] array) {
        // Check if the array is empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Initialize max with the first element of the array
        int max = array[0];

        // Iterate through the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
