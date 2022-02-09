public class MetodyKlasa {
    void firsMethod(){
        System.out.println("To jest pierwsza metoda. ");
        System.out.println("Utworzona w klasie MetodyKlasa");
        System.out.println("Która nic nie zwraca typu void!");
    }
    void twoMethod(int number){
        System.out.println("To jest metoda druga z dodanym parametrem int:"+" " + number);
    }
    void threeMethod(int number, int number2){
        System.out.println("To jest metoda z dwoma parametrami int:"+" "+ number+" " + number2);
    }

    int fourMethod(int a, int b){
        int result = a + b;
        return result;
    }
}
