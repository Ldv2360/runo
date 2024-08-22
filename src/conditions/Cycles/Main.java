package conditions.Cycles;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
//            System.out.println("i: " + i);
        }

//        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
//            System.out.println("j: " + j);
            j++;
        }

//        System.out.println("\nDo while:");
        int k = 1;
        do {
//            System.out.println("Iteration " + k);
            k++;
        }
        while (k <= 5);

        boolean flag = true;
        Random r = new Random();
        int num;
        while (flag) {
            num = r.nextInt(10);
            System.out.println(num);
            if (num == 5) {
                flag = !flag;
                System.out.println("выход из цикла");
            }
        }

//        System.out.println("\nNested loop ");
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.println(a + " " + b);

                if (a == b) {
//                    System.out.println("совпадение");
                }
            }
        }



    }
}
