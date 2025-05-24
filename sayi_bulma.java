import java.util.Scanner;

public class sayi_bulma {
    public static void main(String []args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int ilksayi=input.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int ikincisayi=input.nextInt();
        System.out.println("3. sayıyı giriniz: ");
        int ücüncüsayi=input.nextInt();

        System.out.println("En büyük sayı: "+Math.max(Math.max(ilksayi,ikincisayi),Math.max(ikincisayi,ücüncüsayi)));
    }
}
