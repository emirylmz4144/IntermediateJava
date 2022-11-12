public class Main {
    static void PrimeNumber()
    {
        int count=0;// Kontrol için sayaç atanmıştır
        for (int controlValue=4;controlValue<=100;controlValue++)//Başlangıç değerinden 100'e kadar
        {
            for (int checkingValue=1;checkingValue<=controlValue;checkingValue++)
            {
                if (controlValue%checkingValue==0)
                {
                    count++;//asal sayılar 1 ve kendisine bölünür burası 2'yi geçmezse sayı asaldır
                }
            }
            if (count==2)
            {
                System.out.println("1-100 arasında "+controlValue+" asal sayıdır");
            }
            count=0; //sayaç sıfırlanarak bir sonraki değerin asal sayı kontrolü için hazır hale gelir

        }
    }
    public static void main(String[] args)
    {
        PrimeNumber();//Fonksiyon oluşturulmasının sebebi ileride tekrar ihtiyaç duyulursa kodu tekrar yazmamak
    }
}