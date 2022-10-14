import java.util.Scanner;
public class Main
{
    static int check=0;
    static int isPrime(int value,int checkValue)
    {
        if (checkValue==0)
        {
            return check;
        }
        if (value%checkValue==0)
        {
            check++;
        }
        return isPrime(value,checkValue-1);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        while (value<=1)
        {
            System.out.println("Lütfen en küçük asal sayı olan 2 den büyük sayılar yazınız..");
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
}