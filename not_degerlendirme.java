import java.util.Scanner;

public class not_degerlendirme {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen aldığınız notu giriniz: ");
        int not=input.nextInt();

        switch (not)
        {
            case 90,91,92,93,94,95,96,97,98,99,100:
                System.out.println("A");
                break;
            case 80,81,82,83,84,85,86,87,89:
                System.out.println("B");
                break;
            case 70,71,72,73,74,75,76,77,78,79:
                System.out.println("C");
                break;
            case 60,61,62,63,64,65,66,67,68,69:
                System.out.println("D");
                break;
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
                System.out.println("F");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}
