import java.util.Scanner;

/**
 * dogukanyarimelGİTHUB6
 */
public class dogukanyarimelGİTHUB6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("KM Verisini giriniz : ");
        double km = scan.nextInt();
        double price = 10 + (km * 2.20);
        price = (price < 20 ) ? 20 : price;

        System.err.println("Taksimetre : " + price +  " "  +  "TL");
        
    }

    
}