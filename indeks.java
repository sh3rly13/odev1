import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Boy ve kilo değerini kullanıcıdan alıp Vücut Kitle İndeksini hesaplamak.
        indeks = kilo (kg) / boy (m) * boy (m)
         */
        double kilo,boy,indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz -virgül kullanarak- (metre) : ");
        boy = input.nextDouble();
        if (!(boy<2.50 && boy>0.50)) {
            System.out.println("LÜTFEN METRE CİNSİNDEN GİRİNİZ...");
            return;
        }
        System.out.print("kilonuzu giriniz : ");
        kilo = input.nextDouble();
        indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+ indeks);

    }
}