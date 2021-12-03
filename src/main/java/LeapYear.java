public class LeapYear {
    private static boolean leap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
    public static void main(String[] args) {
        boolean resalt = leap(2021);
        System.out.println(resalt);

    }
}
