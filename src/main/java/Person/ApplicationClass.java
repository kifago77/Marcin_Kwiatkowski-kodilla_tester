package Person;

public class ApplicationClass {
    public static void main(String[] args) {
        Application person = new Application(45.5, 178, "Adam");
        System.out.println("Name"+ " "+ person.name);
        System.out.println("How old is Adam"+" "+ person.age);
        System.out.println("How tal is Adam"+ " "+ person.height);
    }
}
