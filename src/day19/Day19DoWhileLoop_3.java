package day19;

import java.util.Scanner;

public class Day19DoWhileLoop_3 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere tam sayilar isteyin islemi bitirmek icinde 0'a basmasini isteyiniz
        kullanici 0'a bastiginda toplam kac pozitif tam sayi girdigini ve girdigi sayilarin toplaminin
        kac oldugunu yazdiriniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayac=0;
        int toplam=0;
        int a=scan.nextInt();
               do {
                   System.out.println("Lutfen bir sayi giriniz");
            toplam+=a;
            sayac++;
            a= scan.nextInt();


        }
        while (a!=0);
        System.out.println("Toplam "+sayac+" sayi girdiniz. Ve girdiginiz sayilarin toplami : "+toplam);



    }
}
