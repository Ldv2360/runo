package conditions.ifElse;

public class Main {
    public static void main(String[] args) {
        boolean isCold = false;
        boolean isShine = false;

        if (isCold) {
            System.out.println("Нужно надеть шапку");
        } else if (isShine) {
            System.out.println("Нужно надеть кепку");
        } else {
            System.out.println("Можно обойтись без головного убора");
        }
    }
}
