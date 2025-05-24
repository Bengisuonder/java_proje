import java.util.Scanner;

public class scanner {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.println("Yaşınız: "+ yas);

        Scanner ad = new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        String isim = ad.nextLine();
        System.out.println("İsminiz: "+isim);
    }
}
