import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, Newpassword;
        int secim;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (username.equals("baran") && password.equals("java")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Yanlış Şifre");
            System.out.println("Şifre sıfırlamak ister misiniz?\nEvet için -> 1");
            secim = inp.nextInt();

            if (secim == 1) {
                System.out.println("Yeni Şifre Giriniz : ");
                Newpassword = inp.nextLine();

                if (Newpassword != password) {
                    System.out.println("Şifre Oluşturuldu");
                } else {
                    System.out.println("Şifre Oluşturulamadı");
                }
            }
        }
    }
}