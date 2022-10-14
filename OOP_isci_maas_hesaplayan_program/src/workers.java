
public class workers {
    private String name;
    private double salery;
    private int workHours;
    private int hireyear;
    public workers (String name,int salery,int workHours,int hireyear)
    {
        this.name=name;
        this.salery=salery;
        this.workHours=workHours;
        this.hireyear=hireyear;
    }
    public double infooftax()
    {
        if (salery>1000)
        {
            return 1000*0.03;
        }
        else
            return 0.00;

    }
    public double infoofworhhours()
    {
        return 10*this.workHours;
    }
    public double infoofhireyear()
    {
        if (hireyear>0 && hireyear<=10 )
        {
            return this.salery*0.05;
        }
        else if (hireyear>10 && hireyear<=20)
        {
            return this.salery*0.15;
        }
        else
        {
            return this.salery*0.35;
        }
    }
    public double allsalary()
    {

        this.salery=this.salery+infoofworhhours()+infoofhireyear()-infooftax();
        return this.salery;
    }
    public void showtheinfo()
    {
        System.out.println("İŞÇİNİN ADI : "+this.name);
        System.out.println("İŞÇİNİN DÜZ MAAŞI : "+this.salery);
        System.out.println("İŞÇİNİN ÇALIŞMA SAATİ : "+this.workHours);
        System.out.println("İŞÇİNİN ÇALIŞDIĞI YIL : "+this.hireyear);
        System.out.println("İŞÇİYE YAPILAN ÇALIŞMA SAATİ BONUSU : "+infoofworhhours());
        System.out.println("İŞÇİYE YAPILAM ÇALIŞMAŞ YILI BONUSU : "+infoofhireyear());
        System.out.println("İŞÇİYE YAPILAN VERGİ KESİNTİSİ : "+infooftax());
        System.out.println("İŞÇİNİN TOPLAM MAAŞI : "+allsalary());

    }
}