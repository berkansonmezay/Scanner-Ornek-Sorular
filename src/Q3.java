import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
       /*
       Soru: Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        		Isminiz : John
        		Soyisminiz : Doe
        		Yasiniz : 44
        		Kaydiniz basariyla tamamlanmistir.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        // String icin kullanilabilen next() sadece ilk space'e kadar olan kismi alir
        //                            nextLine() ise o satirda yazilan tum bilgiyi alir
        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi yaziniz");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Isminiz : " + isim +"\nsoyisminiz : "+ soyisim+
                            "\nyasiniz : "+ yas + "\nKaydiniz basariyla tamamlanmistir.");
    }
}
