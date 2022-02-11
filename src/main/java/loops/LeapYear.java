package loops;

public class LeapYear {
    private static boolean leap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
    public static void main(String[] args) {
        boolean result = leap(2020);
        System.out.println(result);

    }
}
