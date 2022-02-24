package Abstract;

public  class Pickup extends Cars {
    @Override
    public void engineCapacity() {
        System.out.println("Capacity 5500cm");

    }

    @Override
    public void doors() {
        System.out.println("The wave 2 doors");


    }

    @Override
    public void typeOfBody() {
        System.out.println("Pick-up");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed 180 km/h");

    }

    @Override
    public void typeOfFuel() {
        System.out.println("Diesel");

    }
}
