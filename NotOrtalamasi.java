package TemelKavramlar;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenleri oluşturduk
        int mat , fiz , kim, turk , tar , muzik;

        //Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alalım
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turk = input.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tar = input.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        int toplam = (mat+fiz+kim+turk+tar+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc );

        //Sınıfı geçip geçmeme işlemi
        String ort=sonuc >= 60 ? ("Sınıfı Başarıyla geçtiniz")  :("Sınıftan kaldınız!");
        System.out.println(ort );
    }
}
