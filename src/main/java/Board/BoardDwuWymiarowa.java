package Board;

public class BoardDwuWymiarowa {
    public static void main(String[] args) {
//Stwórz tablice dwuwymiarową o dowolnych wartosciach:
        int[][]tab = new int[2][4];
        tab[0][0] = 1;
        tab[0][1] = 3;
        tab[0][2] = 34;
        tab[0][3]  = 99;
        System.out.println();
        tab[1][0] = 45;
        tab[1][1]  = 12;
        tab[1][2] = 88;
        tab[1][3] = 22;
        System.out.println(tab[1][3]);
        System.out.println(tab.length);
        int sum = tab[0][2] + tab[1][3];
        System.out.println(sum);



    }
}
