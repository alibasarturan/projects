import java.util.Scanner;

public class kdvhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int tutar;
        System.out.print("Fiyatı giriniz :");
        tutar = input.nextInt();
        double kdvOranı = 0.18;
        double toplamFiyat = (kdvOranı * tutar) + tutar;
        System.out.print(toplamFiyat);


    }
    }

