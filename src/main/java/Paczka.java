public class Paczka {
    private int dlugosc;
    private int szerokosc;
    private int wysokosc;

    public Paczka(int aDl , int aSze , int aWys){
        dlugosc = aDl;
        szerokosc = aSze;
        wysokosc = aWys;
        //Przypisuje parametry do Paczki ktore chce obliczyc
    }
    public int obliczObj(){
        return dlugosc * szerokosc * wysokosc;
    }
    public int obliczPodst(){
        return dlugosc * szerokosc;
    }
    //Tworze metode obliczajaca obj i podstawe

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
        int podstawa = telewizor.obliczPodst();
        System.out.println(podstawa);

        int wysokosc = telewizor.PodajWysokosc();
        System.out.println(wysokosc);
        int szerokosc = telewizor.PodajSzerokosc();
        System.out.println(szerokosc);
        int dlugosc = telewizor.PodajDlugosc();
        System.out.println(dlugosc);

        }
    }
