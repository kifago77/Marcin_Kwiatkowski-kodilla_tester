public class LoopsWhileDo {
    public static void main(String[] args) {
        //Petla while;
        int number = 1;
        while (number <= 10){
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        //Petla 'while do'.tz. najpierw wykonaj potem sprawdz.
         int number1 = 5;
         //Wykonaj.
        do {
            System.out.println(number1++);
        }while (number1 <=10);//Sprawdz.
    }
}
