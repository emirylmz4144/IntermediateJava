import java.util.Scanner;

public class ArraySequence
{
    public int [] createArray()// Dizinin oluştuğu metot
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
        return array;
    }

    public void sequenceToArray(int [] ourArray)/*Dizinin sıralandığı metot olup oluşan diziyi parametre
                                                    olarak alır ve sıralar */
    {

        for (int i = 0; i < ourArray.length; i++)
        {
            for (int j = i; j < ourArray.length; j++)
            {
                if ((j + 1) < ourArray.length)
                {
                    if (ourArray[j] > ourArray[j+1])//Dizinin ilgili elamanını bir sonraki elemanla karşılaştırır
                    {                               //Koşul sağlanırsa aşağıdaki işlemlere geçer
                        int temp=ourArray[j];// dizinin ilgili elemanını boşaltır
                        ourArray[j]=ourArray[j+1];//büyük elemanı bir sonraki sıraya ekler
                        ourArray[j+1]=temp;//Küçük elemanı bir  önceki sıraya ekler
                    }
                }
            }
        }
        for (int i=0;i<ourArray.length;i++)// Dizinin sıralanmış halini yazdırır
        {
            System.out.println(ourArray[i]);
        }
    }
}

