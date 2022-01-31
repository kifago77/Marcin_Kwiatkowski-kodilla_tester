public class Paczka {
    int dlugosc;
    private int szerokosc;
    private int wysokosc;
    private int wartosc;


    public Paczka(int aDl , int aSze , int aWys){
        dlugosc = aDl;
        szerokosc = aSze;
        wysokosc = aWys;
    }
    public int obliczObj(){
        return dlugosc * szerokosc * wysokosc;
    }

    public int PodajDlugosc(){
        return dlugosc;
    }
    public int PodajSzerokosc(){
        return szerokosc;
    }
    public int PodajWysokosc(){
        return wysokosc;
    }


    public static void main(String[] args){


        Paczka telewizor = new Paczka(150, 30, 90);
        int objetosc = telewizor.obliczObj();

        System.out.println(objetosc);


        int podajDl = telewizor.PodajDlugosc();

        }
    }
