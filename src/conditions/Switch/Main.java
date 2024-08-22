package conditions.Switch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dayNumber;

        Random rand = new Random();
        dayNumber = rand.nextInt(1, 10);
        System.out.println("Число - " + dayNumber);

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неверный номер дня недели");
        }

        String dayName; //camelCase
        dayName = switch (dayNumber) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверный номер дня недели";
        };
        System.out.println(dayName);


        String dayType; //camelCase
        dayType = switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> "Будний день";
            case 6, 7 -> "Выходной";
            default -> "Неверный номер дня недели";
        };
        System.out.println(dayType);
    }
}
