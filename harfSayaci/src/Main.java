import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner veri=new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        String kelime=veri.nextLine();
        int [] alfabe=new int[26];
        for (int i=0;i<kelime.length();i++)
        {
            alfabe[((int) kelime.charAt(i))-97]++;
        }
        for (int i=0; i< alfabe.length;i++)
        {
            if (alfabe[i]!=0)
            {
                System.out.println(((char)(i+97))+" "+ alfabe[i]);
            }
        }

    }


}