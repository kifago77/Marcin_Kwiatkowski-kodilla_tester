package User;

public class UserClass {
    String name;
    int age;
    public UserClass(String name, int age){
       this.name = name;
       this.age = age;
    }

    public static void main(String[] args) {
        UserClass obiekt = new UserClass("Marcin", 45);
        UserClass sylwia = new UserClass("Sylwia", 42);
        UserClass wiktoria = new UserClass("Wiktoria",18);
        UserClass mikolaj = new UserClass("Mikolaj", 11);
        UserClass[] user2 = {obiekt,sylwia,wiktoria,mikolaj};
        System.out.println();
        System.out.println(user2.length);

    }
}
