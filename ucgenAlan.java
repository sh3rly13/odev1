import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Üç kenar uzunluğunu kullanıcıdan aldığımız üçgenin alanını hesaplayan program.
        u = (a+b+c)/2
        Alan = sqrt(u*(u-a)*(u-b)*(u-c))
         */
        double a,b,c,alan,u;                            // kenarları ve diğer değişkenleri tanımladık
        Scanner input = new Scanner(System.in);

        System.out.print("ilk kenarını giriniz : ");    // kenar bilgilerini aldık kullanıcıdan
        a = input.nextInt();

        System.out.print("ikinci kenarı giriniz : ");
        b = input.nextInt();

        System.out.print("Üçüncü kenarı giriniz : ");
        c = input.nextInt();

        u = (a+b+c)/2;                                  // alan hesaplaması için gerekli olan karekök ü Math kütüphanesinden kullandık
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı : "+ alan);


        /**
         * @author Dogan ADANALI
         * @subject java101 Üçgen Alan Hesaplama
         */
    }
}
