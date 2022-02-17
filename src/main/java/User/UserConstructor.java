package User;

public class UserConstructor {
    //Konstruktor w klasie User
    String name;
    int age;
    public UserConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        int[]user;
        user = new int[10];
        UserConstructor marcin = new UserConstructor("marcin", 45);
        UserConstructor sylwia = new UserConstructor("sylwia" , 42);
        UserConstructor wiktoria = new UserConstructor("wiktoria", 17);
        UserConstructor mikolaj = new UserConstructor("mikolaj", 11);
        UserConstructor franciszek = new UserConstructor("franciszek", 71);
        UserConstructor stanislaw = new UserConstructor("stanislaw" , 68);
        UserConstructor miroslawa = new UserConstructor("miroslawa", 65);
        UserConstructor romana = new UserConstructor("romana", 65);
        UserConstructor lukasz = new UserConstructor("lukasz", 38);
        UserConstructor ewa = new UserConstructor("ewa",35);
        UserConstructor piotr = new UserConstructor("piotr", 35 );


        UserConstructor[] users = {marcin,sylwia,wiktoria,mikolaj,franciszek,stanislaw,miroslawa,romana,lukasz,ewa,piotr};


        int result = 0;
        for(int i = 0; i< users.length; i ++) {
            result = result + users[i].getAge();

        }
        int average = result % users.length;
        System.out.println(average);












    }

}
