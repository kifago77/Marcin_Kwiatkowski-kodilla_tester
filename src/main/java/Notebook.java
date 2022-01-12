public class Notebook {
    String weight;
    int price;
    public Notebook(String weight, int price) {
        this.weight = weight;
        this.price = price;

    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheep.");
    }
        if (this.price < 800) {
            System.out.println("The price is good");
        }

        if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }

        }
}
