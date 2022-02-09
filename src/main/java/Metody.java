public class Metody {
    public static void main(String[] args) {

        MetodyKlasa obiekt = new MetodyKlasa();
        obiekt.firsMethod();

        System.out.println();

        System.out.println("Metoda z jednym argumetem");
        obiekt.twoMethod(348);//Wywołanie metody z jednym argumentem.

        System.out.println();

        System.out.println("Metoda z dwoma argumentami");
        obiekt.threeMethod(555, 454);

        System.out.println();

        System.out.println("To jest metoda zwracająca ");
        int result = obiekt.fourMethod(50,50);
        System.out.println(result);


    }
}
