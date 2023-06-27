import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List arrayList=Arrays.asList(new Kisi("emir","yılmaz",21, Kisi.ARABADURUMU.VAR),new Kisi("bilal","yılmaz",24, Kisi.ARABADURUMU.YOK),new Kisi("Hilal","yilmaz",26, Kisi.ARABADURUMU.VAR));
        /*kisileriFiltrele(arrayList, new KisiFiltreleme() {
            @Override
            public boolean filtrele(Kisi kisi) {
                return kisi.getName().contains("i")&&kisi.getAge()>21;
            }
        });
         */
        kisileriFiltrele(arrayList,k->k.getName().contains("e"));
        System.out.println("------------------------------");
        kisileriFiltrele(arrayList,k-> k.getArabadurumu().equals(Kisi.ARABADURUMU.VAR));

    }
    public static void kisileriFiltrele(List<Kisi> kisiler,KisiFiltreleme filtreleme)
    {

        for (int i=0;i<kisiler.size();i++)
        {
            if (filtreleme.filtrele(kisiler.get(i)))
            {
                System.out.println(kisiler.get(i));
            }
        }
    }
}