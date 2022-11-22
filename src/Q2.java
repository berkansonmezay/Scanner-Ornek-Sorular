import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

      /*
      Soru:      Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
                 dikdortgenin alanini yazdirin.
       */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdorgenin iki kenar uzunlugunu girin " +
                "\niki kenar uzunlugu arasinda enter'a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("dikdortgenin alani : " + (kenar1*kenar2));



    }
}
