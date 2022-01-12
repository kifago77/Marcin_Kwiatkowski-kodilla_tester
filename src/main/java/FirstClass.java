public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!");
        String Example = "Hello from FirstClass";
        System.out.println(Example);
        String text = (Example);
        System.out.println(text);
        System.out.println(text + Example);

        if (1 > 2) {
            System.out.println("Niesamowite! Jeden jest większe niż dwa");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa");
        }


        Notebook notebook = new Notebook("600g", 1000);
        System.out.println(notebook.weight + notebook.price);
        notebook.checkPrice();


        Notebook heavyNotebook = new Notebook("2000g", 1500);
        System.out.println(heavyNotebook.weight + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook("1200g",500);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();




    }
}
