package Computer;

public class Notebook {
    String name;
    int price;
    int year;
    int weight;


    public Notebook(String name, int price, int year, int weight) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.weight = weight;
    }

    //Dodanie w konstruktorze nowej metody,
    // Ktora bedzie sprawdzac cene,
    //Ktora wykorzystam w klasie NotebookClass
    public void cheekPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is cheep");
        }
        if (this.price >= 900) {
            System.out.println("This notebook is quiet expensive");
        }
    }

    public void cheekYear() {
        if (this.year > 2017 || this.year == 2013) {
            System.out.println("This notebook is new");
            System.out.println("Is ok");
        } else {
            System.out.println("This notebook is old");
        }
    }
    public void cheekWeight() {
        if (this.weight <= 1250) {
            System.out.println("This Notebook is light");
        } else {
            System.out.println("Tis Notebook is very heavy");
        }
    }
}