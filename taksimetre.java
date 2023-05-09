import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Taksimetre Programı
        Açılış : 10 tl
        Km başına : 2.20 tl
        Minimum 20 tl olacak. 20 tl altında ücret çıkarsa yine 20 tl alınacak
         */
      
        double km,perKm = 2.20,total = 10;              // değişkenleri tanımladık

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz (km): ");    // km girdisini aldık
        km = input.nextInt();

        total += (km * perKm);                          // ücret hesaplamasını yaptık
        total = (total<20)?20:total;                    // min 20 tl ödenmesinin koşulunu ayarladık

        System.out.println("Toplam Tutar : "+ total);   // çıktıyı gösterdik

    }
}
