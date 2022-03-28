package day19;

import java.util.Scanner;

public class Day19WhileLoop_3 {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        bu degerler inclusive olmak uzere aralardaki cift tam sayilari while loop kullanarak yazdiriniz
         */
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int f= scan.nextInt();
        System.out.println("Lutfen iki tam sayi giriniz");

        while (s<=f) {
            if (s%2==0){
                System.out.println(s);

            }
            s++;
        }




    }
}
