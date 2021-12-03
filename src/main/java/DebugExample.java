public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 30;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        sum.sumAndDisplay(firstNumber, secondNumber);
        System.out.println(sum.sum(30, 22));
        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }

    }
    private static void sumAndDisplay(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

}


