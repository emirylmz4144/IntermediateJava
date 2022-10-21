import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20,4,3,3};
        int[] frekans = new int[array.length];
        System.out.print("Dizi: " + Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < array.length; i++)
            frekans[i] = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    array[j] = 0;
                }
            }
        }
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < array.length; i++) {
            if (frekans[i] >= 1) {
                if (array[i] != 0)
                    System.out.println(array[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
            }
        }


    }
}