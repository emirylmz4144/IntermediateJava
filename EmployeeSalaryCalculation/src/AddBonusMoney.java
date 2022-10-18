public class AddBonusMoney
{
    Employee employee;
    int nowYear;

    public AddBonusMoney(Employee employee)
    {
        this.employee = employee;
        this.nowYear=2021;
    }

    double calculateTax()
    {
        double taxQuality =calculateSaleryWithoutTax();
        if (this.employee.salary >= 1000)
        {
            taxQuality = ((taxQuality)*(0.03));
        }
        else
        {
            System.out.println("Çalışan maaşı 1000 TL den az olduğu için vergi muafiyetine tabiidir.");
            taxQuality = 0.0;
        }
        return taxQuality;
    }

    double bonus()
    {
        double workBonus = 0;
        if (this.employee.workHours >= 40)
        {
            workBonus = ((this.employee.workHours - 40) * 30) * 4;
        }
        else
        {
            System.out.println("Çalışan haftada 40 saatten az çalıştığı için bonus alamamaktadır");
        }
        return workBonus;
    }
    double raiseSalary()
    {
        int workYear=this.nowYear-this.employee.hireYear;
        double yearBonus=0.0;
        if(workYear<10)
        {
            yearBonus=((this.employee.salary)*(0.03));

        }
        else if (workYear<20)
        {
            yearBonus=((this.employee.salary)*(0.1));
        }
        else if (workYear<30)
        {
            yearBonus=((this.employee.salary)*(0.15));
        }
        return yearBonus;
    }
    double calculateSaleryWithoutTax()
    {
        return (this.employee.salary+bonus()+raiseSalary());
    }
    double workerRealSalary()
    {
        return this.employee.salary=(calculateSaleryWithoutTax()-calculateTax());

    }
}
