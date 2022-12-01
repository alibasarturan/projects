import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz:");
        userName = input.next();

        System.out.print("Şifreyi  giriniz:");
        password = input.next();

        if (userName.equals("Patika") && password.equals("123456789")) {
            System.out.print("Giriş Başarılı");
        } else {
            System.out.print("Giriş Başarısız");
        }


       }
    }

