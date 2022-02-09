public class LoopsFor {
    public static void main(String[] args) {
       // Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0.

       // Liczby od 0-30
        for(int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        //Liczby od 30 - 0
        System.out.println();
        for (int j = 30; j >= 0; j--){
            System.out.print(j+ " ");
        }
        System.out.println();

        //Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30
        //Liczby parzyste od 0 do 30
        for (int i = 0; i <= 30; i = i+ 2){
            System.out.print(i+ " ");
        }
        System.out.println();
        //Liczby nieparzyste od 0 - 30
        for (int i = 1 ; i <= 30; i= i + 2){
            System.out.print(i+ " ");
        }
        System.out.println();
        //Przyklad String
        String[] imie = new String[] {"Marcin", "Sylwia", "Wiktoria", "Mikolaj"};
        System.out.println(imie.length);
        System.out.println();

        for (int i = 0; i < imie.length ; i++) {
            System.out.println(imie[i]);
        }

        }

    }



