public class Notebook {
    String weight;
    int price;
    int year;
    public Notebook(String weight,int price,int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice() {
        if (this.price < 600 ) {
            System.out.println("This notebook is very cheap.");
        }

        if(this.price < 600 && this.price > 1000) {
            System.out.println("The price is good.");
        }

        if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkYear() {
        if(this.year < 2018) {
            System.out.println("This notebook is old.");
        }
        if (this.year > 2018) {
            System.out.println("This notebook is fresh.");
        }
    }

        }



