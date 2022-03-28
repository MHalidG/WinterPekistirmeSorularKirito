package day19;

public class Day19DoWhileLoop_2 {
    public static void main(String[] args) {
        /*
        'm' harfinden baslayarak c harfine kadar tum harfleri yazdiriniz
         */

        char s='m';
        char f='c';
        do {
            System.out.println(s);
            s++;
        }
        while (s!=f);

    }
}

