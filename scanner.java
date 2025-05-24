import java.util.Scanner;

public class scanner {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int yas;
        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();
        String isim;
        System.out.println("İsminizi giriniz: ");
        isim = input.nextLine();
    }
}
