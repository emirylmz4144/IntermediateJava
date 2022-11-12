import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Proje zaten temel düzey olduğundan kod satırları eklenmemiştir.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mükemmel sayı olup olmadığını merak ettiğiniz sayıyı giriniz: ");
        int inputValue = input.nextInt();
        int isPerfectNumber = 0;

        for (int i = 1; i < inputValue; i++)
        {
            if (inputValue % i == 0)
            {
                isPerfectNumber += i;
            }
        }
        if (isPerfectNumber==inputValue)
        {
            System.out.println("Girilen sayı mükemmel sayıdır");
        }
        else
        {
            System.out.println("Girilen sayı mükemmel sayı değildir");
        }
    }
}
