package conditions.Incapsulation;

public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    public Clock() {
        this.hour = 0;
        this.minute = 0;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        this.minute = minute;
    }

    public String getTime() {
        tick();
        return String.format("%02d:%02d", hour, minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private void tick() {
        this.minute++;
    }
}
