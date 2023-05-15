import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Manavdan alınan ürünlerin kg değerine göre toplam tutarı ekrana yazdıran program.
        armut - 2.14 tl
        elma - 3.67 tl
        domates - 1.11 tl
        muz 0.95 tl
        Patlıcan 5.00 tl
         */

        double armut = 2.14, elma = 3.67, domates = 1.11,muz = 0.95, patlican = 5.00;   // sabit değerleri belirttik
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,toplam;                        // değişkenleri tanımladık

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        armutKg = input.nextInt();
        System.out.print("Elma kaç kilo : ");
        elmaKg = input.nextInt();
        System.out.print("Domates kaç kilo : ");
        domatesKg = input.nextInt();
        System.out.print("Muz kaç kilo : ");
        muzKg = input.nextInt();
        System.out.print("Patlıcan kaç kilo : ");
        patlicanKg = input.nextInt();

        toplam = (armutKg*armut)+(elmaKg*elma)+(domatesKg*domates)+(muzKg*muz)+(patlicanKg*patlican);
        System.out.println("Toplam Borcunuz : "+toplam+" TL ");

    }
}