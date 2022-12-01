import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        int a ;
        int b ;
        int c ;
        Scanner input = new Scanner(System.in);
        System.out.print("1.kenarı giriniz");
        a = input.nextInt();

        System.out.print("2.kenarı gir");
        b = input.nextInt();
        c = (int) Math.sqrt((a*a) + (b*b));
        System.out.println(c);

    }
}
