package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sumNumber(a, b);
        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if (correct){
            System.out.println("Obliczenie dodawania jest poprawne dla liczby"+ " " + 'a');
        }else {
            System.out.println("Obliczenie dodawania jest bledne dla liczby" + " " + 'a');
        }
        System.out.println();
        int subResult = calculator.subtract(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subResult );
        if (correctSub){
            System.out.println("Obliczenie odejmowania jest poprawne");
        }else {
            System.out.println("Obliczenie odejmowania jest bledne");
        }
        System.out.println("Zła metoda");
        int squResult = calculator.square(a);
        boolean correctSqu = ResultChecker.assertEquals(25, squResult);
        if (correctSqu){
            System.out.println("Liczba jest poprawna");
        }else {
            System.out.println("Liczba jest bledna");
        }
        System.out.println();
        int divisionResult = calculator.division(a, b);
        boolean correctDivision = ResultChecker.assertEquals(40, divisionResult);
        if(correctDivision){
            System.out.println("Obliczenie jest poprawne");
        }else {
            System.out.println("Obliczenie jest bledne");
        }


    }
}
