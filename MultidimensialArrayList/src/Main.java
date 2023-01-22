
import java.util.*;

public class Main {
    public static void main(String[] args)


    {


    /*
        Object [] array=new Object[5];
        for (int i=0;i<array.length;i++)
        {
            array[i]=new ArrayList<>();
        }



        ArrayList<Integer> ourList=new ArrayList<>();
        array[0]=ourList;
        ourList.add(3);
        ourList.add(4);
        System.out.println(array[0]);
      */

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen kaç satırlı dinamik array oluşturacağınızı giriniz: ");
        int row=input.nextInt();// Kullanıcıdan satır sayısı alınır
        ArrayList<ArrayList<Integer>> ourArrayList=new ArrayList<>();// Her satıra ayrı bir arrayList eklenmiştir.
        for(int i=0; i < row; i++)
        {
            ourArrayList.add(new ArrayList<>());
        }//Her satıra yeni arrayList ekleme işlemi gerçekleşiyor

        for (int i=0;i<row;i++)
        {
            System.out.print("Lütfen "+(i)+".satıra kaç eleman eklemek istediğinizi giriniz: ");
            int col=input.nextInt();
            for (int j=0;j<col;j++)
            {
                System.out.print((i)+" "+(j)+".yere eklemek istediğiniz elemanı giriniz ");
                int value=input.nextInt();
                ourArrayList.get(i).add(value);// İlgili satıra eleman ekleme işlemi gerçekleştirilmiştir..
            }
        }

        for (int i=0;i<row;i++)//Yazdırma işlemi gerçekleştirilmiştir
        {
            int listToin=ourArrayList.get(i).size();
            for (int j=0;j<listToin;j++)
            {
                System.out.print(ourArrayList.get(i).get(j)+" ");
            }
            System.out.println();
        }

        while (true) //Kontrol işlemi
        {
            System.out.println("Lütfen kaçıncı sütündaki elemanı ve kaçıncı satıdaki elemanı görmek istediğinizi yazınız: ");
            System.out.print("Kaçıncı satır: ");
            int whichRow=input.nextInt();//Kaçıncı satır
            System.out.print("Kaçıncı sütün: ");
            int whichCol=input.nextInt();//Kaçıncı sütün
            if (whichRow>=row|| whichCol>=ourArrayList.get(whichRow).size())
            {
                System.out.println("ERROR!");
            }
            else
            {
                System.out.println(ourArrayList.get(whichRow).get(whichCol));
            }
        }




    }
}

