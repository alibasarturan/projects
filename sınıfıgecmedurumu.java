import java.util.Scanner;

public class sınıfıgecmedurumu {
    public static void main(String[] args) {
        int mat ,tr,fzk,kimya;
        double toplam;
        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz!");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz!");
        fzk = input.nextInt();
        System.out.print("Kimya notunuzu giriniz!");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz!");
        tr = input.nextInt();
        toplam= (mat+fzk+tr+kimya);
        if (toplam>200){
            System.out.println("Geçer");}
        else {System.out.println("Kaldı!");}




    }
}
