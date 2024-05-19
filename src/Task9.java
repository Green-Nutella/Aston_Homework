public class Task9 {
    public static void leapYear() {
        int year = 12;

        boolean yearLeapTrue = (year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0);
        System.out.println(yearLeapTrue);
    }
}
