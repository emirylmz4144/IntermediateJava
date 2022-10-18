public class Employee
{
    String name;
    double salary;
    int  workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void writeInformations(AddBonusMoney addBonusMoney)
    {
        System.out.println("Çalışanın Adı: "+this.name);
        System.out.println("Çalışanın Maaşı: "+this.salary);
        System.out.println("Çalışanın Haftalık çalışma saati: "+this.workHours);
        System.out.println("Çalışan Çalışma Yılı "+this.hireYear);
        System.out.println("Çalışan Aylık mesai ücreti: "+addBonusMoney.bonus());
        System.out.println("Çalışanın tecrübe ücreti : "+addBonusMoney.raiseSalary());
        System.out.println("Çalışanın vergisiz Maaşı: "+addBonusMoney.calculateSaleryWithoutTax());
        System.out.println("Çalışandan kesilen vergi ücreti: "+addBonusMoney.calculateTax());
        System.out.println("Çalışa ödenecek ücret: "+addBonusMoney.workerRealSalary());


    }


}

















