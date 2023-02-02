import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        //Dosya Oluşturma
        File ourFile=new File("deneme.txt");

        try
        {
          if (ourFile.createNewFile())
              System.out.println("Dosya oluşturuldu..");
            else
                System.out.println("Dosya zaten var..");
        }
        catch (IOException ioException)
             {
                 System.out.println(ioException.getStackTrace());
             }




        //Dosya silme
        boolean deleteToFile=ourFile.delete();
        if (deleteToFile)
            System.out.println("Dosya silindi..");
        else
            System.out.println("Dosya zaten silindi veya belirtilen  dosya yok");



        //Dizinli dosya oluşturma
        File ourNewFile=new File("example/new/directory");

        if (ourNewFile.mkdirs())
        {
            System.out.println("Dosya oluşturuldu");
        }
        else
        {
            System.out.println("Dosya zaten var ");
        }


        //Dizinli dosya isimlerinin listelenmesi

        File ourBigFile=new File("example/new/directory");
        String [] list=ourBigFile.list();

        for (String name: list)
        {
            System.out.println(name);
        }

    }
}