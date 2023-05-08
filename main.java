import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fiz, kimya, turk, tarih, muzik;        // değişken tanımladık

        Scanner inp = new Scanner(System.in);           // kullanıcıdan verileri alacak sınıfımızı tanımladık

        System.out.print("Matematik notunu girin : ");  // Kullanıcıdan if else kullanmadan değerleri aldık
        mat = inp.nextInt();

        System.out.print("Fizik notunu girin : ");
        fiz = inp.nextInt();

        System.out.print("kimya notunu girin : ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunu girin : ");
        turk = inp.nextInt();

        System.out.print("Tarih notunu girin : ");
        tarih = inp.nextInt();

        System.out.print("Muzik notunu girin : ");
        muzik = inp.nextInt();

        int toplam = (mat+fiz+kimya+turk+tarih+muzik);  // Notları toplayıp
        double sonuc = toplam / 6.0;                    // ortalamasını aldık
        System.out.println("Genel ortalaması : "+sonuc);// ekrana yazdırdık

        String gectiMi = (sonuc >= 60.0)?"Sınıfı GEÇTİ":"Sınıfta KALDI"; // sonuc 60 a eşit ya da büyük ise
        System.out.println(gectiMi);                                     //"Sınıfı GEÇTİ" değilse "Sınıfta KALDI" yazdırsın

        /**
         * @author Doğan Adanali
         * @subject PatikaDev 6 aylık Yazılım Eğitimi Desteği Hafta 0 ödevi
         * @other If else kullanılmadan ödev hazırlanmalıdır.
         */
    }
}