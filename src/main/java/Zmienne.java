public class Zmienne {
    public static void main(String[] args) {


        System.out.println("Cześć Marcinie");
        System.out.println("Jak się masz , Co u Ciebie Słychać ?");
        System.out.println("Wszystko w Porzadku.");


        String result = age();
        System.out.println(result);

        System.out.println(seyHello("Wojtek"));

        System.out.println(seyHello1());

        String resalt = seyHello1();
        System.out.println(resalt);

        System.out.println(number(11, 5));



    }
    private static String seyHello(String name ){
        String text = "Cześć" + name;
        return text;
    }

    private static String seyHello1(){
        String text1 = "Wszystko w Porzadku";
        return text1;
    }

    private static String age(){
        String age = "Mam 45 lat.";

        return age;
    }

    private static int number(int a ,int b){
        int number1 = a + b;
        return number1;
    }

}
