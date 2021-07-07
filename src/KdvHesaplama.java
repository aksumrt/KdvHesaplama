import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double kdvOrani = 0.18 , kdvsizFiyat , kdvliFiyat , kdv ;

        System.out.println("Lütfen KDVsiz Fiyati giriniz :");
        Scanner inp = new Scanner(System.in);
        kdvsizFiyat = inp.nextDouble();
        kdv = kdvOrani * kdvsizFiyat ;
        System.out.print("KDV tutari: ");
        System.out.println(kdv);

        kdvliFiyat = kdv + kdvsizFiyat;
        System.out.print("KDVli fiyat");
        System.out.println(kdvliFiyat);

    }
}
