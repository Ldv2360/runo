package conditions.Types;

public class Main {
    public static void main(String[] args) {
        byte myByte = 127;
        System.out.println("byte: " + myByte);

        short myShort = 32_000;
        System.out.println("short: " + myShort);

        int myInt = 2_000_000_000;
        System.out.println("int: " + myInt);

        long myLong = 3_000_000_000L;
        System.out.println("long: " + myLong);

        float myFloat = 3.14f;
        System.out.println("float: " + myFloat);

        double myDouble = 3.14;
        System.out.println("double: " + myDouble);

        char myChar = 'A';
        System.out.println("char: " + myChar);

        boolean myBoolean = false;
        System.out.println("boolean: " + myBoolean);

        int a = 12;
        int b  = 5;

        a += b;
        System.out.println("Сложение: " + a);
        a -= b;
        System.out.println("Вычитание: " + a);
        a *= b;
        System.out.println("Умножение: " + a);
        a /= b;
        System.out.println("Деление: " + a);
        a %= b;
        System.out.println("Остаток от деления: " + a);

        System.out.println("Инкремент a: " + ++a);
        System.out.println("Инкремент a: " + ++a);
        System.out.println("Инкремент a: " + ++a);

        System.out.println("Инкремент a: " + a--);
        System.out.println("Инкремент a: " + a--);
        System.out.println("Инкремент a: " + a--);


        // Операции с плавающей точкой
        double x = 5.5;
        double y = 2.0;

        double sumD = x + y;
        double differenceD = x - y;
        double productD = x * y;
        double quotientD = x / y;
        double remainderD = x % y;  // Остаток от деления

        System.out.println("Сложение (double): " + sumD);
        System.out.println("Вычитание (double): " + differenceD);
        System.out.println("Умножение (double): " + productD);
        System.out.println("Деление (double): " + quotientD);
        System.out.println("Остаток от деления (double): " + remainderD);

        char charValue = 'A';
        int charToInt = charValue;
        char nextChar = (char) (charValue + 2);

        System.out.println("charVal: " + charValue);
        System.out.println("charToInt (автоматическое приведение): " + charToInt);
        System.out.println("nextChar (явное приведение): " + nextChar);
    }
}
