package day19;

public class Day19WhileLoop_2 {
    public static void main(String[] args) {
/*
Task:For loop ve while loop kullanarak 3 basamakli sayilardan 15-20-90'a tam bolunebilen sayilari yazdiriniz
 */

        /*
15'e bolunebilme kurali hem 3'e hem de 5'e tam bolunebilmesidir
20'e bolunebilme kurali hem 4'e hem de 5'e tam bolunebilmesidir
90'a bolunebilme kurali hem 9'a hem de 10'a tam bolunebilmesidir
         */


        int s=100;
        int f=999;

while(s<f){

    for (int i = s; i <f ; i++) {
        if (s%3==0&&s%5==0){
            System.out.println(s);
            s++;
        }

        else if(s%4==0&&s%5==0){
            System.out.println(s);
            s++;
        }
        else if (s%9==0&&s%10==0){
            System.out.println(s);
            s++;
        }
        else {s++;}

    }
    s++;
}




    }

}
