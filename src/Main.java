import java.util.Scanner;
public class Main {
    static public void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayilarini toplayan program");
        System.out.println("Sayi giriniz");
        int sayi = input.nextInt();
        int total=0;
        int basValue =0;
        while (sayi != 0) {
            basValue= sayi%10;
            total += basValue;
            sayi= sayi/10;
        }
        System.out.println(total);

    }
}


