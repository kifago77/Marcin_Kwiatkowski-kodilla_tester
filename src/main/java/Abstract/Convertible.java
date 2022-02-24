package Abstract;

public class Convertible extends Cars  {
    @Override
    public void engineCapacity() {
        System.out.println("Capacity 3500cm");

    }

    @Override
    public void doors() {
        System.out.println("Two doors");

    }

    @Override
    public void typeOfBody() {
        System.out.println("Convertible");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed 250km/h");

    }

    @Override
    public void typeOfFuel() {
        System.out.println("Benzine");

    }
}
