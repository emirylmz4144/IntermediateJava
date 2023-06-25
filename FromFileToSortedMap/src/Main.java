import java.io.*;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)
    {

        SortedMap<Integer,String> ourStudentInformations=new TreeMap<>();
        File file=new File("InformationsOfStudent.txt");
        try {

            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null)
            {
                String [] toMap =line.split(" ");
                ourStudentInformations.put(Integer.parseInt(toMap[0]),toMap[1]);
            }
        }catch (IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }

        for (int i:ourStudentInformations.keySet())
        {
            System.out.println("Anahtar değer: "+i+" Anahtarın karşılık geldiği değer: "+ourStudentInformations.get(i));
        }
    }
}