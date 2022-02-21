package Board;

public class SimpleArray {
    public static void main(String[] args) {
        //Sposob pierwszy tablica String z trzema nazwami
        String[]nameBook= {"Harry Potter", "Orient Express", "Bechawiorysta"};
        System.out.println(nameBook[2]);
        System.out.println(nameBook.length);
        System.out.println();

        //Sposob drugi z przypisywaniem
        String[]kindsAnimal = new String[4];
        kindsAnimal[0] = "Pies";
        kindsAnimal[1] = "Kot";
        kindsAnimal[2] = "Rybki";
        kindsAnimal[3] = "Chomik";
        System.out.println(kindsAnimal[3]);
        System.out.println(kindsAnimal[0] +" "+ kindsAnimal[3]);
        System.out.println(kindsAnimal.length);
        System.out.println();
        //Utworzenie zmiennej kindsAnimal wyswietlajacej wielkosc tablicy
        int numberAnimal = kindsAnimal.length;
        System.out.println(numberAnimal);
        String text = "Tablica zawiera trzy tytuły ksiazek";
        System.out.println(text +" ,"+ nameBook[0]+ " ,"+ nameBook[1]+ ", "+ nameBook[2]);

    }
}
