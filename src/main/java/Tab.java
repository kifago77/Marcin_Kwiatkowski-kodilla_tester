public class Tab {
    public static void main(String[] args) {

        //Tworzenie tablicy dwuwymiarowej o parametrach 2x5
        int[][] tab = new int[2][5];
        tab[0][0] = 10;
        tab[0][1]= 5;
        tab[0][2]= 8;
        tab[0][3]= 123;
        tab[0][4]= 23;
        System.out.println("Wywołanie z tab 0 liczb");
        System.out.println(tab[0][1]);
        tab[1][0]= 12;
        tab[1][1] = 15;
        tab[1][2] = 134;
        tab[1][3] = 19;
        tab[1][4] = 90;
        System.out.println("Wywołanie liczb z tablicy 1");
        System.out.println(tab[1][4]);
        System.out.println("Sprawdzenie dł tablicy");
        System.out.println(tab.length);
        System.out.println();
        System.out.println("Sumowanie");
        int sum = tab[0][2] + tab[1][0];
        System.out.println(sum);

        System.out.println("Sprawdzenie czy liczba int jest parzysta");
        int number = 8;
        System.out.println(number);
         if(number % 2 == 0 ) {
             System.out.println("Liczba jest parzysta");
         }else {
             System.out.println("Liczba jest nieparzysta");
         }

    }


}
