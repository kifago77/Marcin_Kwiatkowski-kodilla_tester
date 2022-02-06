public class Calculator {
    //Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić.
    // Co więcej, niech będzie na tyle prostym kalkulatorem,
    // że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
    //Dobrze jakbyś wykorzystał do tego instrukcję "switch" w celu jej przećwiczenia,
    // chociaż na początek możesz spróbować to zrobić "if'em".
    //(podpowiedź: będziesz potrzebował co najmniej trzech zmiennych -
    // dwie zmienne do przechowywania liczb
    // oraz trzecia zmienna jako znak operacji np. '+' dla dodawania)
    public static void main(String[] args) {
        double number1 = 100;
        double number2 = 15;
        char sign = '/';
        double result = 0;

        switch (sign) {
            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;
            case '*' :
                result = number1 * number2;
                System.out.println(result);
                break;
            case '/' :
                result = number1 / number2;
                System.out.println(result);
                break;
            default:
                System.out.println("Podales niewlasciwy znak");
                System.out.println(number1 + "" + sign + number2+ "=" + result) ;
        }

    }
}
