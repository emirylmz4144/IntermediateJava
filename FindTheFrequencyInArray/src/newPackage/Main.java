package newPackage;

import java.util.Arrays;

public class Main
{

    static boolean isFind(int[] array, int value, int tempArrayLenght)
    {
        for (int i = 0; i < tempArrayLenght; i++)
        {
            if (value == array[i])
            {
                return false;
            }
        }
        return true;
    }

    static int getFrequency(int[] array, int value) {
        int frequency = 0;
        for (int i : array)
        {
            if (i == value)
            {
                frequency++;
            }

        }
        return frequency;
    }

    public static void main(String[] args)
    {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(array));

        for (int i = 0; i <array.length; i++)
        {
            if (isFind(array, array[i], i))
            {
                System.out.println(array[i] + " sayısı " + getFrequency(array, array[i]) + " kez tekrar edildi.");
            }
        }
    }
}