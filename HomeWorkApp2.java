public class HomeWorkApp2 {
    public static void main(String[] args) {
        //Задание 1:
        System.out.println(lim1020(15,5));
        //Задание 2:
        positiveOrNegativeZ2(-7);
        // Задание 3:
        System.out.println(positiveOrNegativeZ3(110));
        // Задание 4:
        String text = """
                Шел однажды через мост, глядь - ворона сохнет,
                Взял ворону я за хвост, положил ее под мост -
                Пусть ворона мокнет.
                Шел обратно через мост, глядь - ворона мокнет,
                Взял ворону я за хвост, положил ее на мост -
                Пусть ворона сохнет.
                """;
        prnStrNTimes(text, 3);
        //Задание 5:
        System.out.println (leapYear(2100));
    }
    public static boolean lim1020(int a, int b) {
        return (10 <= (a + b) & (a + b) <= 20);
    }
    public static void positiveOrNegativeZ2(int a) {
        if (a < 0) {
            System.out.println ("Число отрицательное");
        } else {
            System.out.println ("Число положительное");
        }
    }
    public static boolean positiveOrNegativeZ3(int a) {
        return (a < 0);
    }
    public static void prnStrNTimes(String text, int n) {
        for (int i=0; i<n; i++) {
            System.out.println(text);
        }
    }
    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}