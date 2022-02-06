public class Tablica {
    public static void main(String[] args) {
        String[] movie = new String[]{"Harry", "Potter", "Gra", "Oś Zła"};
        System.out.println(movie.length);

        String[] film = new String[3];
        film[0] = "Harry Potter";
        film[1] = "Sun";
        film[2] = "Gra";

        System.out.println(film[2]);

        String text = "Tablica zawiera trzy filmy";
        System.out.println(text);
        System.out.println("Tab.zaw.3 filmy:" + film[0] + film[1] + film[2]);

        int numberFilm = film.length;
        System.out.println(numberFilm);

    }
}
