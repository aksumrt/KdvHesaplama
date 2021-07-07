import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double kdvOrani1 = 0.18 , kdvOrani2 = 0.08 , kdvsizFiyat , kdvliFiyat , kdv = 0 ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen KDVsiz Fiyati giriniz :");

        kdvsizFiyat = inp.nextDouble();

        if(kdvsizFiyat<=1000 && kdvsizFiyat>0)
        {
            kdv = kdvOrani1 * kdvsizFiyat;
            System.out.print("KDV tutari: ");
            System.out.println(kdv);

            kdvliFiyat = kdv + kdvsizFiyat;
            System.out.print("KDVli fiyat :" + kdvliFiyat);
          //  System.out.println(kdvliFiyat)

        }
        else if(1000<kdvsizFiyat)
        {
            kdv = kdvOrani2 * kdvsizFiyat;
            System.out.print("KDV tutari: ");
            System.out.println(kdv);

            kdvliFiyat = kdv + kdvsizFiyat;
            System.out.print("KDVli fiyat :" + kdvliFiyat);
         //   System.out.println(kdvliFiyat)

        }
        else
        {
            System.out.println("Doğru değerleri girdiğinizden emin olunuz.");
        }






    }
}
