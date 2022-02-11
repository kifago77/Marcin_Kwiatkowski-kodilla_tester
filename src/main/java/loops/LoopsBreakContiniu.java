package loops;

public class LoopsBreakContiniu {
    public static void main(String[] args) {
        int number;
        for (number = 0 ; number <= 20; number++){
            System.out.println(number);
            if (number < 18){
                continue;//Pominięcie liczby 18
            }
            System.out.println("Pierwsza petla"+ '-'  +number);
            System.out.println();

            //Dla czego powtarza petle?

            int number1;

            for (number1 = 0; number1 <= 30; number1++){
                System.out.println(number1);
                if (number1 == 15){
                    break;
                }
                System.out.println("Zmienna drugiej petli number1"+'-' + number1);
            }

        }

    }
}
