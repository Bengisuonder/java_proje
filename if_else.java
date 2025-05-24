import java.util.Scanner;

public class if_else {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int sayi;
        System.out.println("Lütfen bir sayı giriniz: ");
        sayi= input.nextInt();

        if(sayi>0)
        {
            System.out.println("Sayı pozitif.");
        }
        else if(sayi==0)
        {
            System.out.println("Sayı sıfır.");
        }
        else
        {
            System.out.println("Sayı negatif.");
        }
    }
}
