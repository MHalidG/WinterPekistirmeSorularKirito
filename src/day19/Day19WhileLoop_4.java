package day19;

import java.util.Scanner;

public class Day19WhileLoop_4 {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdiriniz
                 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int rT=0;

        while (sayi!=0) {
            rakam = sayi % 10; //2
            rT += rakam; // 2
            sayi /= 10;

        }
        System.out.println(rT);
    }
}
