package com.newpackage;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner veri=new Scanner(System.in);
        Random salla=new Random();
        int can=4,i=0;
        int sayi= salla.nextInt(1,50);
        System.out.println(sayi);
        boolean oyundurumu=false,hata=false;
        int []tahminler=new int[5];
        while (can>=0)
        {
            System.out.println("Lütfen bir 1-50 arasında bir sayi giriniz: ");
            int tahmin= veri.nextInt();
            if (tahmin<=0 || tahmin>=50)
            {
                System.out.println("Lütfen 1-50 arası bir sayi giriniz: ");
                if (hata)
                {
                    System.out.println("ÇOK FAZLA YANLIŞ DEĞER GİRDİNİZ "+can);
                }
                hata=true;
                continue;
            }
            tahminler[i++]=tahmin;
            if (tahmin==sayi)
            {
                oyundurumu=true;
                break;
            }
            else
            {
                System.out.println("Yanlis cevap tekrar dene kalan can hakkınız:  "+can);
                can--;
            }
        }
       if (oyundurumu)
       {
           System.out.println("Kazandınız:)) kalan can hakkınız: "+can);
       }
       else
       {
           System.out.println("maalesef kaybettiniz:((");
       }
        for (int m:tahminler)
        {
            if (m!=0)
            {
                System.out.print(m+" ");
            }
        }
    }
}
