public class Tablica {
    public static void main(String[] args) {
        String[] movie = new String[]{"Harry", "Potter", "Gra", "Oś Zła"};
        System.out.println();

        System.out.println(movie.length);

        String[] film = new String[3];
        film[0] = "Harry";
        film[1] = "Potter";
        film[2] = "Gra";

        System.out.println(film[2]);

        String text = "Tablica zawiera trzy filmy";
        System.out.println(text);

        int numberFilm = film.length;
        System.out.println(numberFilm);

    }
}
