package Computer;

public class NotebookClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 2000, 2018);
        System.out.println(notebook.weight + " "+ notebook.price);

        System.out.println();
        Notebook heavyNotebook = new Notebook("2500g.", 1500, 2013);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        System.out.println();
        Notebook oldNotebook = new Notebook("1800g.", 400, 2008);
        System.out.println(oldNotebook.weight+ " " + oldNotebook.price);

        System.out.println("Wykorzystanie metody cheekPrice sprawdzającej cenę");
        System.out.println("Notebook");

        notebook.cheekPrice();
        notebook.cheekYear();
        System.out.println("CheavyNotebook");
        heavyNotebook.cheekPrice();
        heavyNotebook.cheekYear();
        System.out.println("OldNotebook");
        oldNotebook.cheekPrice();
        oldNotebook.cheekYear();
    }
}
