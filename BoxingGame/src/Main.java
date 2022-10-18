public class Main {
    public static void main(String[] args)
    {
        Fighter fighter1=new Fighter("EMİR YILMAZ",15,100,80);
        Fighter fighter2=new Fighter("BEYHUN YAMAN",10,90,75);
        MatchArea matchArea=new MatchArea(fighter1,fighter2,100,70);
        matchArea.run();

    }
}