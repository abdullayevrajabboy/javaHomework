public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Yaroqsiz soat!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Yaroqsiz daqiqa!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soniya!");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            nextMinute();
        }
    }

    public void nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            nextHour();
        }
    }

    public void nextHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
    }

    public void previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            previousMinute();
        }
    }

    public void previousMinute() {
        minute--;
        if (minute == -1) {
            minute = 59;
            previousHour();
        }
    }

    public void previousHour() {
        hour--;
        if (hour == -1) {
            hour = 23;
        }
    }

    public static void main(String[] args) {
        MyTime time = new MyTime(10, 30, 45);
        System.out.println("Birinchi vaqt: " + time.toString());

        time.nextSecond();
        System.out.println("Keyingi soniya: " + time.toString());

        time.previousHour();
        System.out.println("Oldingi soat: " + time.toString());

        time.setTime(25, 70, 80);
        System.out.println("Vaqt o'zgartirilgandan so'ng: " + time.toString());
    }
}
