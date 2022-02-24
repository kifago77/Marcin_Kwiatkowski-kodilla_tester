package Abstract;

public class Sedan extends Cars {
    @Override
    public void engineCapacity() {
        System.out.println("Capacity 2500m ");

    }

    @Override
    public void doors() {
        System.out.println("The have four doors");

    }

    @Override
    public void typeOfBody() {
        System.out.println("Sedan");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed 250km/h");

    }

    @Override
    public void typeOfFuel() {
        System.out.println("Benzine or Diesel");

    }
}
