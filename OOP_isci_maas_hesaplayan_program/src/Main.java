

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner veri=new Scanner(System.in);
        System.out.println("LÜTFEN İŞÇİNİN ADINI GİRİNİZ:  ");
        String ad=veri.nextLine();
        System.out.println("LÜTFEN İŞÇİNİN BRÜT MAAŞINI GİRİNİZ:  ");
        int maas=veri.nextInt();
        System.out.println("LÜTFEN İŞÇİNİN GÜNDE KAC SAAT  ÇALIŞTIĞINI GİRİNİZ:  ");
        int calismaSaati= veri.nextInt();
        System.out.println("LÜTFEN İŞÇİNİN BURADA KAC YILDIR ÇALIŞTIĞINI GİRİNİZ:  ");
        int calismaYili=veri.nextInt();
        workers worker1=new workers(ad,maas,calismaSaati,calismaYili);
        worker1.showtheinfo();
    }
}