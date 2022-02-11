package loops;

public class LoopsTaskCd {
    public static void main(String[] args) {
        //Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny
        // o przyprostokątnych składających się z n-razy * (gwiazdki) ;)
        //np. podając n = 5 powinniśmy otrzymać taki trójkąt:
        System.out.println("Zadanie 1");
        int n = 5;
        int star = 1;
        for (int i = 1; i<= n; i++) {
            for (int j = 1; j<= i; j++){
                System.out.print('*');
            }
            System.out.println();
            star++;
        }
        System.out.println("Zadanie 2");
        //Narysuj odbicie lustrzane trójkąta z poprzedniego zadania
        // tj. dla n = 5 powinniśmy ujrzeć:
        int numberStar = 1;
        int numberSpace = n-1;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= numberSpace; j++ ){
                System.out.print(" ");
            }
            for (int j = 1; j <= numberStar; j++){
                System.out.print("*");
            }
            System.out.println();
            numberSpace--;
            numberStar++;
        }
        System.out.println("Zadanie 3");
        //Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki)
        // drzewko choinkowe o wysokości n =5
    }
}
