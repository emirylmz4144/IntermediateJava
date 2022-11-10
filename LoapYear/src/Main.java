import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Artık yıl hesaplamaya hoşgeldiniz araştırmak istediğiniz yılı giriniz:  ");
        int year=input.nextInt();
        if (year%100==0 && year%400==0)
        {
            System.out.println("Girdiğiniz yıl bir artık yıldır");
        }
        else if (year%100!=0 && year%4==0)
        {
            System.out.println("Girdiğiniz yıl bir arık yıldır");
        }
        else
        {
            System.out.println("Girdiğiniz yıl artık yıl değildir");
        }
    }
}