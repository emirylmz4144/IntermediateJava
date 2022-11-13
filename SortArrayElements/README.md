### Projedeki Bilinmesi gerekenler

1) ```java
      public static void main(String[] args)
        {
            ArraySequence arraySequence=new ArraySequence();
        }
   Dizinin nesnesini üretir
    ```
2) ```java
   public static void main(String[] args)
        {
            
            int [] dizi= arraySequence.createArray();
        }
   Diziyi oluşturmak için ayrı bir metot kullanılır 
   çünki programda önce diziyi oluşturma daha sonra sıralama
   ihtiyacı düşünülerek herhangi bir metotla bağlantılı
   olmayan ayrı bir metot üretilmiştir
   ```
   
3) ```java
      public static void main(String[] args)
        {
    arraySequence.sequenceToArray(dizi);
        }
   Dizinin sıralandığı eleman olup içine 
   oluşan diziyi parametre olarak alır
   ayrıca 2.maddedeki gibi bir gereksinim için
   ayrı bir metot olarak yazılmıştır
   
   ```