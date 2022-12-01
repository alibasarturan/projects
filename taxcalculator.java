import java.util.Scanner;

public class taxcalculator {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km gittiyseniz yazınız:");
        a= input.nextInt();
        int başlangıç = 10;
        double kmBasi = 2.20;
        double Borcunuz = başlangıç + (a*kmBasi);
        //alttakinde küçük eşittir yapınca neden sorun oldu??
        Borcunuz= (Borcunuz<=20)? 20: Borcunuz;
        System.out.println(Borcunuz);




    }
}
