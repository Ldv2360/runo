package conditions.Debug;

public class Main {
    public static void main(String[] args) {
        // Арифметические операции с целыми числами
        int a = 10;
        int b = 5;

        int sum = a + b;        // Сложение
        int difference = a - b; // Вычитание
        int product = a * b;    // Умножение
        int quotient = a / b;   // Деление
        int remainder = a % b;  // Остаток от деления

        // Операции с символами
        char char1 = 'A';
        char nextChar = (char) (char1 + 1); // Получение следующего символа

        // Автоматическое (неявное) приведение типов
        int intVal = 100;
        long longVal = intVal; // int автоматически приводится к long
        double doubleVal = longVal; // long автоматически приводится к double

        // Явное приведение типов (сужение типа)
        double doubleValue = 9.78;
        int intFromDouble = (int) doubleValue; // Явное приведение double к int, дробная часть отбрасывается

        // Приведение типов с потерей данных
        int largeInt = 128;
        byte byteVal = (byte) largeInt; // int явно приводится к byte, возможна потеря данных

        byteVal = 126;
        byteVal++;
        byteVal++;
        byteVal++;
        byteVal++;

        byteVal--;
        byteVal--;
        byteVal--;
        byteVal--;
        byteVal--;


    }
}
