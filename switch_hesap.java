import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Switch - case kullanarak hesap makinesi yapma.
         */

        int secim = 0;
        double sayi1 = 0.0, sayi2 = 0.0, islem = 0.0;                   // değişkenleri tanımladık

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");                      // işleme girecek sayıları kullanıcıdan aldık
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        sayi2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");  // Kullanıcıya yapacağı işlem için
        System.out.print("Seciminiz : ");                               // seçim yaptırdık ve bu seçimin numarasına göre
        secim = input.nextInt();                                        // işleme aldık

        switch (secim){                                                 // secim değeri ;
            case 1:                                                     // 1 ise asağıdaki işlemleri yapsın
                islem  = sayi1 + sayi2;                                 // toplama işlemi
                System.out.println(sayi1 +" + "+ sayi2 +" : "+ islem);  // ekrana çıktısını yazdırdık
                break;                                                  // programın devamı için çalışmasının gerek olmadığını söyledik. Zincirlerini BREAK yaptık.
            case 2:
                islem = sayi1 - sayi2;
                System.out.println(sayi1 +" - "+ sayi2 +" : "+ islem);
                break;
            case 3:
                islem = sayi1 * sayi2;
                System.out.println(sayi1 +" x "+ sayi2 + " : "+ islem);
                break;
            case 4:
                islem = sayi1 / sayi2;
                System.out.println(sayi1 +" / "+ sayi2 +" : "+ islem);
                break;
            default:                                                    // kullanıcı 1 ve 4 arasında bir seçim seçmez ise
                System.out.println("1 VE 4 ARASINDA BIR SECIM YAPIN");  // ekrana uyarı yazısı vermiş olduk
        }
    }
}