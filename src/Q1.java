import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {


       /*
       Soru:    Kullanicidan bir double, bir de int sayi alip
                bunlarin toplamini ve carpimini yazdirin.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz ");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        int tamSayi= scan.nextInt();

        System.out.println("Girilen sayilarin toplami : " + (ondalikliSayi+tamSayi));

        System.out.println("Girilen sayilarin carpimi : "+ (ondalikliSayi*tamSayi));

    }
}
