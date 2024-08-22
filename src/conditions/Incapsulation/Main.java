package conditions.Incapsulation;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHour(12);
        clock.setMinute(30);
        System.out.println(clock.getTime());

        Clock clock2 = new Clock(14, 55);
        System.out.println(clock2.getTime());

        System.out.println("часов - " + clock2.getHour() + ", минут - " + clock2.getMinute());

        System.out.println(clock2.getTime());
        System.out.println(clock2.getTime());
        System.out.println(clock2.getTime());
        System.out.println(clock2.getTime());
    }
}
