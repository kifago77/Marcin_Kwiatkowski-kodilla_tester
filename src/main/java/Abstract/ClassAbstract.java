package Abstract;

public class ClassAbstract {
    public static void main(String[] args) {

        Convertible convertible = new Convertible();
        convertible.doors();
        convertible.engineCapacity();
        convertible.maxSpeed();
        convertible.typeOfBody();
        convertible.typeOfFuel();
        convertible.destiny();
        convertible.wheels();
        System.out.println();
        Pickup pickup = new Pickup();
        pickup.doors();
        pickup.typeOfBody();
        pickup.engineCapacity();
        pickup.maxSpeed();
        pickup.typeOfFuel();
        pickup.destiny();
        pickup.wheels();
        System.out.println();
        Sedan sedan = new Sedan();
        sedan.doors();
        sedan.engineCapacity();
        sedan.maxSpeed();
        sedan.typeOfBody();
        sedan.destiny();
        sedan.wheels();
        sedan.typeOfFuel();

    }
}
