import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sıcaklık;
        System.out.print("Sıcaklık giriniz:");
        sıcaklık = input.nextInt();
        if (sıcaklık < 5) {
            System.out.print("Kayak Yap!");
        } else if (sıcaklık >= 5 && sıcaklık <= 15) {
            System.out.println("Sinemaya git!");}
            if (sıcaklık > 10 && sıcaklık <= 25) {
                System.out.println("Pikniğe Git!");}
            else if (sıcaklık>25) {
                System.out.println("Yüzmeye git!");
            }


            }
        }


