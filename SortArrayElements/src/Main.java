import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
        {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizini kaç elemanlı olacağını seçiniz");
        int sizeOfArray = input.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++)
          {
            System.out.print("Dizinin " + (i + 1) + ".elamani: ");
            array[i] = input.nextInt();
          }
        for (int i = 0; i < sizeOfArray; i++)
        {

            for (int j = i; j < sizeOfArray; j++)
            {
                if ((j + 1) < sizeOfArray)
                {
                    if (array[j] > array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }

            }


        }
        for (int i=0;i<sizeOfArray;i++)
        {
            System.out.println(array[i]);
        }


    }
}
