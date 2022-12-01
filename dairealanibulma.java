import java.util.Scanner;

public class dairealanibulma {
    public static void main(String[] args) {
        double pi=3.14;
        int r;
        int 𝛼 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap giriniz");
        r = input.nextInt();
        System.out.println("Açı giriniz");
        𝛼 = input.nextInt();
        double daireCevresi= 2*pi*r;
        double daireAlani = pi*r*r;
        double daireDilimAlanı = (pi * (r*r) * 𝛼) / 360;
        System.out.println("Daire Çevresi:"+daireCevresi);
        System.out.print("Daire Alanı:" + daireAlani);
        System.out.println("Daire Dilimi Alanı" + daireDilimAlanı);


    }
}
