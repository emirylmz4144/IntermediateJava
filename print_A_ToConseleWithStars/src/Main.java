import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen harfin  ne kadar uzun olacağını yazınız: ");
        int rowForLetter=input.nextInt();
        System.out.println("Lütfen harfin  ne kadar geniş olacağını yazınız: ");
        int colForLetter=input.nextInt();
        int [][] letter=new int[rowForLetter][colForLetter];
        for (int i = 0; i < letter.length; i++)
        {
            for (int j = 0; j < letter[i].length; j++)
            {
                if (i == 0 || i ==(letter.length-letter[i].length))
                {
                    System.out.print(" * ");
                }
                else if (j == 0 || j == letter[i].length-1)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}