package loops;

public class LoopsTask {
    public static void main(String[] args) {
        //Zadanie pierwsze!!
        // Podaj dwie dowolne liczby a i b,
        // gdzie a jest mniejsze od b (a < b).
        // Wypisz na ekran zakres liczb od a do b.
        System.out.println("Zadanie 1");
        int a = 0;
        int b = 10;
        for (int i = a; i <= b; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("Zadanie 2");
        //Zadanie 2
        //Utwórz tablicę rozmiaru 6 elementów i uzupełnij liczbami.
        // Wypisz wszystkie liczby z tej tablicy na ekran.

        int[]tab = {2, 9 , 34, 54, 909, 33};
        for (int i = 0; i <= 5; i++ )
        //albo for(int i = 0; i< tab.lenght; i++)
        {
            System.out.print(tab[i]+ " ");
        }
        //Zadanie 3
        // Następnie wypisz wszystkie liczby od tyłu.
        System.out.println();
        System.out.println("Zadanie 3");
        for (int i = 5; i>= 0; i--)
        //albo (int i = tab.lenght - 1 ; i>=0 ; i--);
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Zadanie 4");
        //Zadanie 4.
        //Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów
        int sum = 0;
        for (int i= 0; i < tab.length; i++ ){
            sum = tab[i] + sum; // albo tab[i] = sum;
        }
        System.out.println(sum+ " ");
        System.out.println("Zadanie 5");
        //Zadanie 6!!
        // Napisz program, który będzie obliczał silnię z nieujemnej liczby
        // jeżeli podamy liczbę 5, to zostanie obliczona 5! (wykrzyknik to znak silni).
        // Obliczamy to w następujący sposób:
        //5! = 5 * 4 * 3 * 2 * 1 = 120.
        int number = 5;
        int result = 1;
        for (int i = number; i >= 1; i--){
            result = result * i;
        }
        System.out.println(result);


    }
}
