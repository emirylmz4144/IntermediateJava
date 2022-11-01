import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        double priceOfPear=2.14,priceOfApple=3.67,priceOfTomatoes=1.11,priceOfBanana=0.95,pricdeOfAubergine=5.00;
        System.out.println("FİYAT LİSTESİ:\n\n" +
                "Armutun kilogram fiyatı: "+priceOfPear+"\n"+
                "Elmanın kilogram fiyatı: "+priceOfApple+"\n"+
                "Domatesin kilogram fiyatı: "+priceOfTomatoes+"\n"+
                "Muzun  kilogram fiyatı: "+priceOfBanana+"\n"+
                "Patlıcanın kilogram fiyatı: "+pricdeOfAubergine+"\n");

        System.out.println("Lütfen kaç kilo armut aldığınızı yazınız ");
        double qualityOfPear=input.nextDouble();

        System.out.println("Lütfen kaç kilo armut aldığınızı yazınız ");
        double qualityOfApple=input.nextDouble();

        System.out.println("Lütfen kaç kilo armut aldığınızı yazınız ");
        double qualityOfTomatoes=input.nextDouble();

        System.out.println("Lütfen kaç kilo armut aldığınızı yazınız ");
        double qualityOfBanana=input.nextDouble();

        System.out.println("Lütfen kaç kilo armut aldığınızı yazınız ");
        double qualityOfAubergine=input.nextDouble();


        double result=(priceOfPear*qualityOfPear)+(priceOfApple*qualityOfApple)+(priceOfBanana*qualityOfBanana)+(priceOfTomatoes*qualityOfTomatoes)+(pricdeOfAubergine*qualityOfAubergine);

        System.out.println("Borcunuz: "+result+" Tl dir");
    }
}