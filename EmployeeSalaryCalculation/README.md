### PROJE AÇIKLAMASI

```java

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Emir", 2000, 50, 2002);

        employee.writeInformations(new AddBonusMoney(employee));

    }
}

Main classımızda projenin sadece çalışır kısmı eklenerek 
bütünlüğü sağlanmıştır
```

```java
public class Employee
{
            .
            .
            .
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

            employee sınıfımzda ise ilgili bilgiler
            direkt olarak maaşın hesaplandığı 
            sınıflardan alınarak sürekli 
            olarak sınıfları newleyip hafızada 
            yer ayrılması engellenmiştir
    }
}
```

```java
public class AddBonusMoney
{
    public int metot1()
    {
        //işlemler
    }
    public double()
    {
        // işlemler
    }
                  .
                  .
                  .
    addBonusMoney sınıfımızda ise yapılacak tüm
    işlemler ek bonus para miktarları yapılarak
        solid prensipleri sağlanmıştır.
}

```

Görüldüğü üzere yapılacak işlemler ayrı sınıfta
işçi bilgileri ayrı sınıfta ve programın çalışması 
ayrı sınıfta yapılarak program bütünlüğü sağlanmıştır.