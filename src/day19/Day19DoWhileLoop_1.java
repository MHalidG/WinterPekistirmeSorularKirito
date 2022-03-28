package day19;

public class Day19DoWhileLoop_1 {
    public static void main(String[] args) {
        /*
        9den 190e kadar 7nin kati olan tum tamsayilari ekrana yazdiriniz
         */

        int s=9;
        int f=190;

        do {
            if(s%7==0){
                System.out.println(s);
            }
        s++;
        }
        while (s<190);


    }
}
