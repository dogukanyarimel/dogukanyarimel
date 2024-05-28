import java.util.Scanner;

/**
 * dogukanyarimelGİTHUB3
 */
public class dogukanyarimelGİTHUB3 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1 . Kenarı giriniz : ");
        int a = scan.nextInt();

        System.out.print("2.Kenarı Giriniz : ");
        int b = scan.nextInt();

        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);


    }



}