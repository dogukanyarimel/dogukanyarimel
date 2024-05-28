import java.util.Scanner;

/**
 * dogukanyarimelGİTHUB2
 */
public class dogukanyarimelGİTHUB2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double price , total , kdvPrice, rate = 18;

        System.out.print("Tutar giriniz : ");
        price = scan.nextDouble();

        kdvPrice = price * (rate/100);
        total = kdvPrice + price ; 


        System.out.println("KDV Oranı : % " + (int)rate);
        System.out.println("KDV tutarı : " + kdvPrice);
        System.out.println("KDV'Lİ Tutar : " + total);















    }








    
}