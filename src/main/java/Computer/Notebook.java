package Computer;

public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
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
}