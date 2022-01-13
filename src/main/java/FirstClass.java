public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]

        Notebook notebook = new Notebook("600g", 1000);
        System.out.println(notebook.weight);
        System.out.println(notebook.price);
        System.out.println(notebook.weight + notebook.price);
        System.out.println(notebook.weight + " " + notebook.price);
        if (notebook.price < 900) {
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
        notebook.checkPrice();


        Notebook  heavyNotebook =  new Notebook("2000g", 1500);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);
        System.out.println(heavyNotebook.weight + heavyNotebook.price);
        heavyNotebook.checkPrice();


        Notebook oldNotebook = new Notebook("1600g", 500);
        System.out.println(oldNotebook.weight);
        System.out.println(oldNotebook.price);
        System.out.println(oldNotebook.weight + oldNotebook.price);
        oldNotebook.checkPrice();

    }
}
