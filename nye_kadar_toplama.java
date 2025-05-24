import java.util.Scanner;

public class nye_kadar_toplama {
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int n= input.nextInt();
        int toplam= 0;
        for(int i=1; i<=n;i++)
        {
            toplam= toplam + i ;
        }
        System.out.println("1'den "+ n +"'e kadar olan sayıların toplamı: "+toplam);
    }
}
