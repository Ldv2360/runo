package conditions.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 4, 3, 5, 2};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println("i " + i + ": " + numbers[i]);
        }

        String[] words = {"apple", "banana", "cherry"};
        for (String word : words) {
            System.out.println(word);
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));

        int[] numbersCopy2 = new int[3];
        System.arraycopy(numbersCopy, 1, numbersCopy2, 0, 3);
        System.out.println(Arrays.toString(numbersCopy2));
    }
}
