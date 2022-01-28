public class User {
    String name;
    int age;
    public  User(String name, int age) {
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
        User marcin = new User("marcin", 45);
        User sylwia = new User("sylwia" , 42);
        User wiktoria = new User("wiktoria", 17);
        User mikolaj = new User("mikolaj", 11);
        User franciszek = new User("franciszek", 71);
        User stanislaw = new User("stanislaw" , 68);
        User miroslawa = new User("miroslawa", 65);
        User romana = new User("romana", 65);
        User lukasz = new User("lukasz", 38);
        User ewa = new User("ewa",35);
        User piotr = new User("piotr", 35 );

        User[] users = {marcin,sylwia,wiktoria,mikolaj,franciszek,stanislaw,miroslawa,romana,lukasz,ewa,piotr};


        int result = 0;
        for(int i = 0; i< users.length; i ++) {
            result = result + users[i].getAge();

        }
        int average = result % users.length;
        System.out.println(average);











    }

}
