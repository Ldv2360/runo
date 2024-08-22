package conditions.Practice;

public class Main {
    public static void main(String[] args) {
//        С помощью цикла for выведите в консоль все числа от 5 до 1.
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
//        Напишите программу, которая выводит в консоль последовательность чисел:
//        7 14 21 28 35
        for (int i = 1; i < 36; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        for (int i = 7; i < 36; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        int i = 1;
        while (true) {
            System.out.print(i * 7 + " ");
            i++;
            if (i * 7 > 35) {
                break;
            }
        }
    }
}
