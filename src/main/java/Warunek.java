public class Warunek {


    public static void main(String[] args) {

        int numberOne = 13;
        System.out.println(numberOne);
        int numberTwo = 45;
        System.out.println(numberTwo);

       Warunek sumAndDisplay = new Warunek();
        System.out.println(sumAndDisplay);



        if(numberOne > numberTwo) {
            subtraction(numberOne , numberTwo);
        } else sumAndDisplay(numberOne, numberTwo);

    }

    private static void sumAndDisplay(int a , int b) {
        int result = a + b;
        System.out.println(result);
    }

    private static void subtraction(int a , int b) {
        int result = a - b ;
        System.out.println(result);
    }
}
