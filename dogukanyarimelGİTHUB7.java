/**
 * dogukanyarimelGİTHUB7
 */
import java.util.Scanner;
 public class dogukanyarimelGİTHUB7 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("İki adet sayı giriniz: ");
    
        double ilkSayi = reader.nextDouble();
        double ikinciSayi = reader.nextDouble();
 
        
        System.out.print("İşlem operatörünü giriniz: (+,-,*,/)");
        char operator = reader.next().charAt(0);
        double sonuc = 0;
 
        switch (operator){
 
            case '+':
                sonuc = ilkSayi + ikinciSayi;
                break;
 
            case '-':
                sonuc = ilkSayi - ikinciSayi;
                break;
 
            case '*':
                sonuc = ilkSayi * ikinciSayi;
                break;
            
            case '/':
                sonuc = ilkSayi / ikinciSayi;
                break;
            
            default: 
                System.out.println("Yanlış operatör seçimi!");
                return;
        }
        System.out.println(ilkSayi + " " + operator + " " + ikinciSayi + " = " + sonuc);
    }
}
        





    
