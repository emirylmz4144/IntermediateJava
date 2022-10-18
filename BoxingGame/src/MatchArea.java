import java.util.Random;

public class MatchArea
{
    Fighter fighter1;
    Fighter fighter2;
    int maxWeight;
    int minWeight;

    public MatchArea(Fighter fighter1, Fighter fighter2, int maxWeight, int minWeight) //Constuructor oluşturuldu
    {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    void run() // Maçı başlatmak için run metotu kullanıldı
    {

        if (weightControl()) //Siklet kontrolünden gelen değer ile maç başladı
        {
            while (this.fighter1.healty>=0 && this.fighter2.healty>=0)
            {
                if (whoWin())
                {
                    whoIsAttacker();
                }
                else
                {
                    break;
                }

            }
        }
        else // Sikletler uymuyorsa maç başlamaz
        {
            System.out.println("Sporcuların sikletleri uyuşmuyor..");
        }
    }


    void whoIsAttacker()
    {
        Random random=new Random();
        int whoIsAttacker=random.nextInt(0,3); //Kimin atak yapacağı belirlemek için random sayı üretildi
        if (whoIsAttacker==1) // Eğer dönen değer 1 ise fighter1 atak yapan kişi olacak
        {
            fighter2.healty=fighter1.hit(fighter2);
            if (fighter2.healty<=0) // Sağlığın eksi değere düşüp düşmediği kontrol edildi
            {
                fighter2.healty=0; // sağlık eksi değer ise sağlığın 0 a eşitlenmesi
            }
            System.out.println(fighter2.name+" Kalan gücü: "+fighter2.healty); // Atak yiyen dövüşçünün kalan sağlığı belirlendi
        }
        if (whoIsAttacker==2) // Eğer dönen değer 2 ise fighter2 atak yapan kişi olacak
        {
            fighter1.healty=fighter2.hit(fighter1);
            if (fighter1.healty<=0) // Sağlığın eksi değere düşüp düşmediği kontrol edildi
            {
                fighter1.healty=0;  // sağlık eksi değer ise sağlığın 0 a eşitlenmesi
            }
            System.out.println(fighter1.name+" Kalan gücü: "+fighter1.healty); // Atak yiyen dövüşçünün kalan sağlığı belirlendi
        }
    }

     boolean whoWin() // Kimin kazandığını anlamak için oluşturulan metot
    {                //Hangi dövüşçü kazanırsa ona özel kazanma senaryosu oluşturuldu

        if (fighter2.healty == 0)
        {
            System.out.println("************************************************************");
            System.out.println("************************************************************");
            System.out.println(fighter1.name+" MUHTEŞEM MÜCADELESİ İLE MAÇIN GA Lİ Bİİİİ..");
            System.out.println("************************************************************");
            System.out.println("************************************************************");
            return false;
        }
        else if (fighter1.healty == 0)
        {
            System.out.println("************************************************************");
            System.out.println("************************************************************");
            System.out.println(fighter2.name+" HARİKA MÜCADELESİ İLE MAÇIN GA Lİ Bİİ");
            System.out.println("************************************************************");
            System.out.println("************************************************************");
            return false;
        }

        return true;
       }


    boolean weightControl() // Sporcuların max-min kilolarda olup olmadığı kontrol edilip siklet kontrolü yapılıyor
    {
        return ((this.fighter1.weight>=this.minWeight &&this.fighter1.weight<=maxWeight )&&(this.fighter2.weight>=minWeight && this.fighter2.weight<=this.maxWeight));
    }
}
