### UÇUŞ FİYAT HESAPLAMA 
Uçuş fiyat hesaplama projesinin açıklamalarını aşağıdaki
adımlardan takip etmeniz kodu daha iyi anlamanızı sağlayacaktır

```java
public class Main
{
    public static void main (String[] args)
    {
        run();
    }
}
```
```
Bu kısımda neden kodları direkt olarak
static void main kısmına eklemediğimiz aklınıza gelebilir
bunun sebebi programda olan count değişkeninin
3 kere yanlış bilgi girilince programı sonlandırma 
gereksiniminden kaynaklandığını söyleyebiliriz
bunu neden static void int main ile yapmadığımız 
sorusunun cevabı ise bu durumda karşılaşacağımız 
main metodunun int değer döndürmediği ve kullanılmadığı 
sorunsalıdır.
```

```java

public class Main
{
    static int run()
    {
        if (count<=0)
        {
            //işlemler
        }
    }
}
```
```
run metodunda karşımıza çıkan bu metot 
count değişkenini alarak değerine göre programı 
sonlandırmaktadır int değerinde sahip olmasının sebebi
count değeri 0'dan küçükse return 0 yaparak
programı sonladırır bu sebebpten ötürü int dönüş tiplidir

```

```java

public class Main
{
    public static void PriceCalculation()
    {
        //işlemler
    }
}

```

```
Bu kısımda ayrı bir metot oluşmasının sebebi ise
işlemlerin solid kuralları gereğince farklı bir yerde 
gerçekleşip run metotunda aktarılmasından kaynaklanmıştır
```