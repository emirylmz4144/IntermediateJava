import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*
         kodun ilerisinde count değişkenine  bağlı olarak programın sonlanması gerektiğinden
         işlemler run metodunda yapılmıştır
         */
        run();

    }


    static int run()// Bu metot kullanıcının 3 kere yanlış girme hakkını kontrol etmek için oluşturulmuştur
    {
        int count=3; // 3 kere hatalı tuşlama olursa program gerçekten kullanılmak istemediğini anlayıp kapanacak
        Scanner input=new Scanner(System.in);



        System.out.println("Lütfen gideceğiniz uçuşun mesafesini KM cinsinden yazarmısınız");
        double distance=input.nextDouble();
        while (distance<=0) // program yanıltılmaya çalışırsa mesafe tekrar alınacaktır
        {
            count--;
            if (count<=0)// sayaç değerimiz 0 veya altındaysa program kapatılacaktır
            {
                System.out.println("Programın yanıltılmaya çalışıldığı anlaşılmıştır..");
                return 0; //program kapatılır
            }
            System.out.println("Lütfen uçuş mesafesini doğru giriniz..");
            distance=input.nextDouble();
        }
        double tempPrice=distance*(0.1);// Mesafeye göre indirimsiz fiyat belirlenmiştir



        System.out.println("""
                Yolculuk tipiniz nasıl olacak?:
                1-Sadece gidiş bileti alacağım
                2-Gidiş dönüş bileti alacağım""");
        int choose=input.nextInt();  //choose adlı değişkenimiz kullanıcı seçimini tutmaktadır
        while (choose<1 || choose>2)//İşlemin seçilen seçeneklerden farklı olup olmadığı kontrolü
        {
            count--;
            if (count<=0)// sayaç değerimiz 0 veya altındaysa program kapatılacaktır
            {
                System.out.println("Programın yanıltılmaya çalışıldığı anlaşılmıştır");
                return 0;//program kapatılır
            }

            System.out.println(count);
            System.out.println("Lütfen yolculuk tipinizi seçenekler arasından seçiniz..");
            System.out.println("1-Sadece gidiş bileti alaağım\n" +
                    "2-Gidiş dönüş bileti alacağım");
            choose=input.nextInt();//while yerine if else olsaydı hatalı tuşlamada program kapanacaktı

        }



        System.out.println("Lütfen yaşınızı giriniz:");
        int age=input.nextInt();
        while (age<=0)
        {
            count--;
            if (count<=0)// sayaç değerimiz 0 veya altındaysa program kapatılacaktır
            {
                System.out.println("Programın yanıltılmaya çalışıldığı anlaşılmıştır..");
                return 0;// program kapatılır
            }
            System.out.println("Lütfen gerçek bir yaş giriniz:");
            age=input.nextInt();
        }



       PriceCalculation(age,tempPrice,choose);// Yaşa göre indirim miktarını hesaplayıp ödenecek tutarın belirleneceği metot
        return 1;
    }




/*
Tüm indirim işlemlerini SOLİD kuralları çerçevesinden ilerlemek için burada yaptık

 */
    static void PriceCalculation(int age,double price,int choose) //indirim işlemleri için gerekli parametreler göderildi
    {
        if (age<12)
        {
            price=price-(price*(0.5));
        }
        else if (age<24)
        {
            price=price-(price*(0.1));
        }
        else if(age>65)
        {
            price=price-(price-(price*(0.3)));
        }
        /*
        Gerçek hayata benzetmek için bir uçak firmasını daha az indirim sunması gerekir bu yüzden
        tüm indirimler uygulandıktan sonra gidiş dönüş seçim indirimi uygulanır
         */

        if(choose == 2)
        {
            price=price-(price-(price*(0.2)));
        }

        System.out.println("Ödeyeceğiniz tutar "+price +"TL");

    }
}