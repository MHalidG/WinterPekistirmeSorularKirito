package day19;

import java.util.Scanner;

public class Day19DoWhileLoop_4 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere pozitif tam sayilar isteyin islemi bitmek icin 0'a basmasini isteyin
        kullanici negatif sayi girrse o sayiyi dikkate alamdan negatif sayi giremezsiniz yazdirin basa donun
        kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve yanlislikla kac negatif sayi girdigini
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayac=0;
        int nsayac=0;
        int toplam=0;
        int a=scan.nextInt();

        do {
          if (a>0) {

                System.out.println("Lutfen bir sayi giriniz");
                toplam += a;
                sayac++;
                a = scan.nextInt();
            }
            else if (a<0){
    nsayac++;
    System.out.println("Negatif sayi giremezsiniz");
              a = scan.nextInt();
          }

        }
        while (a!=0);
        System.out.println("Toplam " +nsayac+ " adet negatif sayi ve " +sayac+" tane pozitif sayi girdiniz. " +
                "Girdiginiz pozitif sayilarin toplami : "+toplam);







    }
}
