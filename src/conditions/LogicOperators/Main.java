package conditions.LogicOperators;

public class Main {
    public static void main(String[] args) {
        int money = 60;
        int price = 50;

        if (money == price) {
            System.out.println("Денег ровно столько же, сколько стоит товар");
        } else if (money >= price) {
            System.out.println("Денег больше");
        } else if (money <= price) {
            System.out.println("Денег не хватает");
        }

        if (money != price) {
            System.out.println("Сумма денег не равна цене товара");
        }

        boolean isCold = false;
        boolean isShine = false;

        if (isCold && isShine) {
            System.out.println("Сегодня холодно и солнечно");
        } else if (isCold || isShine) {
            System.out.println("Сегодня холодно или солнечно");
        } else {
            System.out.println("Сегодня не холодно и не солнечно");
        }

        if (!isCold) {
            System.out.println("Сегодня не холодно");
        }

        String result = (isCold) ? "Cold" : "Not cold";
        System.out.println(result);


        String result2 = (price > money) ? "price > money" : "price < money";
        System.out.println(result2);
    }
}
