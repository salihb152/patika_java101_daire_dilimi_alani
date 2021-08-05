import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        int r, acıOlcusu;
        double pi= 3.14, alan, cevre, dilimAlanı;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r=scanner.nextInt();
        System.out.println("Merkez açı ölçüsünü giriniz : ");
        acıOlcusu= scanner.nextInt();

        alan = pi* r*r;
        cevre = 2 * pi * r;
        dilimAlanı= alan*acıOlcusu/360;
        
        System.out.println("Dairenin alanı : " + alan );
        System.out.println("Dairenin çevresi : "+ cevre );
        System.out.println("Daire diliminin alanı : " + dilimAlanı);

    }
}
