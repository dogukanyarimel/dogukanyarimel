import java.util.Scanner;

public class dogukanyarimelGİTHUB5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yarıçap değerini giriniz : ");
        int r = scan.nextInt();
        double alan  = Math.PI * r * r ;
        double cevre = 2 * Math.PI * r;

        System.out.println("Darinenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }


    
}
