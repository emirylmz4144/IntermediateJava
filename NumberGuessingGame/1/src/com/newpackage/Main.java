package com.newpackage;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner veri=new Scanner(System.in);
        Random salla=new Random();
        System.out.println("Lütfen 1-50 arasında bir sayi giriniz: ");
        int sayi= salla.nextInt(1,50);
        int tahmin,i=4;
        boolean oyungelisim=false;
        while (1<=i)
        {
            System.out.println(sayi);
            System.out.println("Lütfen bir sayi giriniz: ");
            tahmin=veri.nextInt();
            if (tahmin<=0 || tahmin>50)
            {
                System.out.println("Hilebaz köpek 1 ile 50 arası sayi gir");
                continue;
            }
            if(tahmin==sayi)
            {
                oyungelisim=true;
                break;
            }
            else
            {
                System.out.println("Asdfjdsjf yanlış cevap :))))");
                i-=1;
            }
        }
        if (oyungelisim)
        {
            System.out.println("Kazandınız:))");
        }
        else
        {
            System.out.println("basaramadiniz");
        }
    }

}
