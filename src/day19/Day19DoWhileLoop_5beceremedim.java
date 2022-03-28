package day19;

import java.util.Scanner;

public class Day19DoWhileLoop_5beceremedim {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.Girilen sifreyi asdagidaki sartlara gore kontrol edin ve sifredeki
        hatalari yazdiriniz.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli bir sifre girdiginde
        "sifreniz kabul edilmistir" yazdirin

        =sifre kucuk harf icermelidir
        =sifre buyuk harf icermelidir
        =sifre ozel karakter icermelidir
        =sifre en az 8 karakter olmalidir
         */

        System.out.println("Lutfen sifrenizi giriniz");
        Scanner scan = new Scanner(System.in);
        String sifre = scan.next();

        do {
            System.out.println("\n" +
                    "        =sifre kucuk harf icermelidir\n" +
                    "        =sifre buyuk harf icermelidir\n" +
                    "        =sifre ozel karakter icermelidir\n" +
                    "        =sifre en az 8 karakter olmalidir");
            sifre = scan.next();
        }
        while (sifre.contains("\\W") && sifre.contains("\\w") && sifre.length() <= 8);
        System.out.println("sifreniz kabul edilmistir");


    }
    }






