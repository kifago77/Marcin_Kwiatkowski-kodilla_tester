public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            System.out.println(i);
        String[] names = new String[3];
        int numberElements = names.length;
        names[0] = "Zygfryd";
        names[1] = "Gwidon";
        names[2] = "Florentyna";
        System.out.println(names[2]);
        System.out.println(names.length);
        for (int i = names.length - 1; i >= 0; i-- ) {
            System.out.println(names[i]);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }


    }






