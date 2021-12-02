public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!");
        String Example = "Hello from FirstClass";
        System.out.println(Example);
        String text = (Example);
        System.out.println(text);
        System.out.println(text + Example);

        if (1 > 2) {
            System.out.println("Niesamowite! Jeden jest większe niż dwa");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa");
        }
    }
}
