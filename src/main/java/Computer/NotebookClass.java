package Computer;

public class NotebookClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Apple", 2000, 2018, 650);
        System.out.println(notebook.weight + " "+ notebook.price);

        System.out.println();
        Notebook heavyNotebook = new Notebook("Dell", 1500, 2013, 2300);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        System.out.println();
        Notebook oldNotebook = new Notebook("Samsung", 400, 2008, 1250);
        System.out.println(oldNotebook.weight+ " " + oldNotebook.price);

        System.out.println("Wykorzystanie metody cheekPrice sprawdzającej cenę");
        System.out.println("Notebook");

        notebook.cheekPrice();
        notebook.cheekYear();
        notebook.cheekWeight();
        System.out.println("CheavyNotebook");
        heavyNotebook.cheekPrice();
        heavyNotebook.cheekYear();
        heavyNotebook.cheekWeight();
        System.out.println("OldNotebook");
        oldNotebook.cheekWeight();
        oldNotebook.cheekPrice();
        oldNotebook.cheekYear();
    }
}
