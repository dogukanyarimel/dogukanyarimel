import java.util.Scanner;

/**
 * dogukanyarimelGİTHUB8
 */
public class dogukanyarimelGİTHUB8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Derece :   ");
        int sicaklik = scan.nextInt();
        String event = "";


        if (sicaklik < 5 ){
            event = "Kayak";
        }else if (sicaklik < 15 ){
            event = "Tiyatro";
        }else if (sicaklik < 25 ) {
            event = "Mangal";
        }else { 
            event = "Yüzme";

        }

        System.err.println("Önerilen Etkinlik : " + event);

        











    }
}