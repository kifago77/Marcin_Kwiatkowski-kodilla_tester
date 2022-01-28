public class Zmienne {
    public static void main(String[] args) {

      Zmienne seyHello = new Zmienne();
        System.out.println("Cześć Marcinie");

        String text = "Jak się masz , Co u Ciebie Słychać ?";
        System.out.println(text);

        Zmienne seyHello1 = new Zmienne();
        System.out.println("Wszystko w Porzadku.");

        String age = "Ile masz lat ?";
        System.out.println(age);

    }
    private static String seyHello(){
        String text = "Cześć Marcinie";
        return text;
    }

    private static String seyHello1(){
        String text1 = "Wszystko w Porzadku";
        return text1;
    }

}
