import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*
        Yazılım prensipleri gereği bu tarz kolay ve anlaşılır kodlara yorum ve readme eklenmez
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Çin zodyağına hoş geldiniz :) Lütfen doğum yılınızı giriniz: ");
        int year=input.nextInt();

        int zodiac=year%12;
        switch (zodiac) {
            case 0 -> System.out.println("Maymun zodisisiniz");
            case 1 -> System.out.println("Horoz zodisisiniz");
            case 2 -> System.out.println("Köpek zodisisiniz");
            case 3 -> System.out.println("Domuz zodisisiniz");
            case 4 -> System.out.println("Fare zodisisiniz");
            case 5 -> System.out.println("Öküz zodisisiniz");
            case 6 -> System.out.println("Kaplan zodisisiniz");
            case 7 -> System.out.println("Tavşan zodisisiniz");
            case 8 -> System.out.println("Ejderha zodisisiniz");
            case 9 -> System.out.println("Yılan zodisisiniz");
            case 10 -> System.out.println("At zodisisiniz");
            case 11 -> System.out.println("Koyun zodisisiniz");
            default -> System.out.println("Hatalı tuşlama yaptınız");
        }

    }
}