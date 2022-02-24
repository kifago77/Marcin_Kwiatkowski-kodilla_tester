package Abstract;

public abstract class Cars {
    //Cechy wspólne auta które posiadaja auta
    public void wheels(){
        System.out.println("The have four wheels");
    }
    public void destiny(){
        System.out.println("Personal car");
    }
    public abstract void engineCapacity();
    public abstract void doors();
    public abstract void typeOfBody();
    public abstract void maxSpeed();
    public abstract void typeOfFuel();
    }


