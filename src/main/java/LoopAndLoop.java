public class LoopAndLoop {
    //Pętla w pętli.
    public static void main(String[] args) {

        int wynik = 0;
        int[][]tab = new int[5][10];

        for(int i = 0;  i < 5; i++){
            for (int j = 0; j< 10; j++) {
                wynik++;
                tab[i][j] = wynik;
                System.out.println(wynik);
            }
        }
        System.out.println();
        // Pętla w pętli + tablica dwuwymiarowa.

        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j< 10; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
