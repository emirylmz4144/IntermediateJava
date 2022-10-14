import java.util.Scanner;

public class Main
{
    static int check=0;
    static int recursive(int number, int tempNumber)
    {

        if (tempNumber>=0 && check== 0)
        {
            if (tempNumber<=5)
            {
                check++;
            }
            System.out.print(tempNumber+" ");
            return recursive(number,tempNumber-5);
        }
        if (tempNumber<=number && check==1)
        {

            System.out.print(tempNumber+" ");
            return recursive(number,tempNumber+5);

        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int number=input.nextInt();
        recursive(number,number);
    }
}