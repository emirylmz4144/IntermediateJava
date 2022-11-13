import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen asal olup olmadığını kontrol etmek istediğiniz sayıyı giriniz: ");
        int value=input.nextInt();
        while (value<=1) // kullanıcının programı yanıltması engellenmiştir 1'den büyük değerler girene kadar çalışır
        {
            System.out.println("Lütfen 2 veya daha büyük sayılar yazınız..");
            value=input.nextInt();
        }
        int result=isPrime(value,value);
        if (result==2)
        {
            System.out.println("Girilen sayi asaldir");
        }
        else
        {
            System.out.println("Girilen sayi asal değildir");
        }
    }


    static int check=0; // recursive fonksiyon olduğu için sayaç static olarak tanımlanmıştır.
    static int isPrime(int value,int checkValue) // asal sayı kontrol fonksiyonu
    {
        if (checkValue==0)// oluşan sayı 0'sa artık fonksiyonu bitirmek gerekir
        {
            return check;// sayı 1 ve kendini bölünürse asaldır yani buradaki değer 2 ise asal olacaktır
        }
        if (value%checkValue==0)// yeni oluşan sayının kalansız bölünme kontrolü
        {
            check++;
        }
        return isPrime(value,checkValue-1);
        /*
         sayının asal olup olmadığını bulmak için ilgili sayıyı her seferinde 1 azaltıp fonksiyona
         tekrar geri döndürürüz
         */
    }
}