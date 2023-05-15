import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Yarıçapı kullanıcıdan aldığımız bir dairede
        açı ölçüsü belirtilen dilimin alanını,
        toplam alanını,
        çevresini bulan program.
        pi = 3.14
        Alan = pi * r * r ;
        Çevre = 2 * pi * r;
        Dilim Alanı hesaplama = (pi * (r * r) * aci) / 360;
         */

        double pi = 3.14, r, aci, cevre, alan, dilim;                       //değişken tanımladık

        Scanner input = new Scanner(System.in);

        System.out.print("Daire yarıçapını (r) giriniz : ");                //yarı çap ve r bilgisini aldık
        r = input.nextInt();
        System.out.print("Daire Diliminin Açı ölçüsünü girin (max 360) : ");
        aci = input.nextInt();

        if (aci>360 || aci < 0) {                                           // dilim derecesini kısıtladık
            System.out.println("0 ve 360 arasında olmalı");                 // 0 ve 360 arasında değilse çıktı verdik
        }

        cevre = 2 * pi * r;                                                 // çevre - alan - dilim hesaplamaları yaptık
        alan = pi * r * r;
        dilim = (pi*(r*r)*aci)/360;

        System.out.println("Dairenin çevresi : "+ cevre);                   // çıktıları ekrana yazdırdık
        System.out.println("Dairenin Toplam alanı :"+ alan);
        System.out.println(aci +" derece olan daire diliminin alanı : "+ dilim);

    }
}