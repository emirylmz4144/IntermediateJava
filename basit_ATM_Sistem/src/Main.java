import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String userName, password;
        Scanner veri = new Scanner(System.in);
        int right = 3;
        int balance = 0;
        int select;

        while (right > 0 ) {
            System.out.print("Kullanıcı Adınız :");
            userName = veri.nextLine();
            System.out.print("Parolanız : ");
            password = veri.nextLine();

            if (userName.equals("emiryilmaz4144") && password.equals("emiryilmaz1234")) {
                System.out.println("Merhaba, Beymir Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = veri.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı : ");
                        int price = veri.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktarı : ");
                        int price = veri.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    } else if (select>=5) {
                        System.out.println("Hatali tuşmala yaptiniz Lütfen işlemlerden birini seçiniz");
                    }
                    System.out.println("Başka işlem yapmak için aşağıdaki numaralardan birini seçiniz\n" +
                            "Başka işlem yapmak istemiyorsanız çıkış yapınız..");
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }

}