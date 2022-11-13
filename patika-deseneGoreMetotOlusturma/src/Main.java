import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int number=input.nextInt();
        method(number,number);
    }
    static int check=0;
    /*
    recursive şekilde fonksiyon oluşturduğumuz için sayının çok önemli bir detay olan sayının 0 veya
    1 olma durumuna göre sayıyı azaltan veya arttıran check değişkeni static olmalıdır
     */
    static int method(int number, int tempNumber)
    {

        if (tempNumber>=0 && check== 0)// eğer check 0 ise sayının azalmasına izin verir
        {
            if (tempNumber<=5)// sayı 5 ten küçük değer aldığı andan itibaren bu sayının son kez azalmasını sağlar
            {
                check++; /*sayının son kez azalmasını sağlamak için check 1 olur
                          ve konrol sağlandığında check 0 olmadığından artık azalma olmaz */

            }
            System.out.print(tempNumber+" ");
            return method(number,tempNumber-5);/* sayıyı tekrar azaltarak recursive eder
                                                            asıl sayı unutulmasın diye her zaman hafızada
                                                            kalmalıdır yoksa arttırma işleminde nereye
                                                            kadar gideceğini bilemez*/
        }
        if (tempNumber<=number && check==1)// check 1 ise  azalması durmuş ; artma işlemine geçmesi gerekmektedir
        {

            System.out.print(tempNumber+" ");
            return method(number,tempNumber+5);

        }
        return 1;
    }
}