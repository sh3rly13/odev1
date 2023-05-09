import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Girilen Tutar 0 - 1.000 arasında ise KDV = 18 olsun 1.000 den büyük ise 8 olsun. kullanıcının girdiği
        para değerinin kdvsiz, kdvlifiyat, kdvoranı nı ekrana yazdıran program. İf else kullanılmasın.
         */

        double kdv,tutar,kdvliTutar,kdvTutar;                       // değişkenleri tanımladık
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz : ");                      // kullanıcıdan girdiyi aldık
        tutar = input.nextInt();

        kdv = (tutar>=1000)?0.08:0.18;                              // mantıksal operatör ile koşullandırma yaptık
        kdvTutar = tutar * kdv;                                     // kdv fiyatını hesaplayıp atamasını yaptık
        kdvliTutar = tutar+kdvTutar;                                // kdv eklenmiş fiyatın hesaplamasını yaptık

        System.out.println("Kdv siz Tutar : "+ tutar);              // ekrana tek tek çıktılarımızı yazdırdık
        System.out.println("kdvli tutar : "+ kdvTutar);
        System.out.println("KDV oranı : "+ kdv);
        System.out.println("kdv eklenmiş tutar : " + kdvliTutar);

        /**
         * @author Dogan ADANALI
         * @subject java101 KDV odevi
         */
    }
}
