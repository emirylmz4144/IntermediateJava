### Fibonacci Serisi 
Bu projede detaylı bir fibonacci serisi oluşturacağız

#### Neyi neden kullandım

 ```
 Önemli bir projede fibonacci serisine ihtiyaç duyulması 
 ihtimalini hesaba katarak fibonacci serisinin oluşmasını
 ve aranan elemanın kontrolünü birer fonksiyona atamak gerekir
 ```

```java
BKZ:
   public static void howelement(//içerikler)

      fibonacci serisinin oluştuğu metot


   public static void check(//içerikler)
      aranan elemanın kontrolünün yapıldığı metot

```

#### Projedeki önemli noktalar

```java
 public static void howelement(int elmntNmbr,int value)
        {
              .
              .
              .
        check(fibonnacciLenght,value);
        }

        Aranacak eleman fibonacci oluşturma metotunda
kullanılarak metotlar birbirine bağlanır böylece her 
fonksiyon tekrar çağrılmak zorunda kalmaz
```

```java
public static void check(//içerikler)
        {
        count++;
        if (count==fibonnacciLenght.length)
        {
        System.out.println("Aradığınız eleman listede yoktur");
        }
        
        count değişkeni burada önem taşır çünki eleman bulunamazsa
bir artar ve listenin boyutuna ulaştığı zaman elemanı 
bulamazsa öyle bir elemanın olmadığını bize sunar


```
