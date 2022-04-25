public class Suma {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.suma();

    }

    private void  suma(){
        int result = add(1,5, 6);
        System.out.println(result);

    }

    private int add(int a, int b , int c){

        return a + b - c;
    }


    }



