public class Podatek {
    //Twoim zadaniem jest obliczenie podatku od dochodu.
    // Obecnie wynosi on 17%. , a od pewnego dochodu zwiększony jest podatek do 32%.
    // Sprawdź ile podatku musiałby zapłacić początkujący programista,
    // zanim przekroczy próg wynoszący 85 528 zł, a ile już ten doświadczony.
    //Wzór:
    //dla dochodu do 85 528 zł podatek wynosi 17%,
    //dla dochodu powyżej 85 528 zł liczy się go następująco:
    //- obliczamy podatek 17% z 85 528,
    //- dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
    //czyli dochód pomniejszony o 85 528 zł i z tego 32%.


    public static void main(String[] args) {
        double kwota = 45.528;
        if (kwota <= 85.528){
            double podatek = kwota * 0.17;
            System.out.println("Podatek do zapłaty" + podatek);
        }else {
            double podatekPonizej = kwota - 85.528;
            double podatekPowyzej = (kwota - 85.528) * 0.32;
            double podatekZplata = podatekPonizej + podatekPowyzej;
            System.out.println(podatekZplata);

        }
    }
}
