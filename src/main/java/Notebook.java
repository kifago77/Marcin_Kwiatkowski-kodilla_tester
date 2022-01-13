public class Notebook {
    String weight;
    int price;
    public Notebook(String weight,int price) {
        this.weight = weight;
        this.price = price;

    }
    public void checkPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }
        }



