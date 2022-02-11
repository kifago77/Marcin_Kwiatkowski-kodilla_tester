package loops;

public class LoopsTab {
    public static void main(String[] args) {
        //Tworzenie Petli i Tablicy o indeksie 10

        int[]tab = new int[10];//Zadeklarowanie wielkości tablicy

        for (int i = 0; i < 10; i++){
            tab[i] = 55;
            System.out.println(i +"- "+ tab[i]);
        }
        System.out.println();

        for (int i = 0; i< tab.length; i++){
            System.out.println(tab[i] + " "+ tab.length);

        }




    }
}
