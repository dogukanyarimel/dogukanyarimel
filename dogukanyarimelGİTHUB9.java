import java.util.Scanner;

/**
 * dogukanyarimelGİTHUB9
 */
public class dogukanyarimelGİTHUB9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Doğum Yılınızı girinizi : ");
        int age = input.nextInt();
        int result = age % 12;
        String msg = "Çin zodyağı Burcunuz : ";
        switch(result){
            case 0 : 
                System.out.println(msg + "Maymun");
                break ; 
            case 1 : 
                System.out.println(msg + "Horoz");
                break ; 
            case 2 : 
                System.out.println(msg + "Köpek");
                break ; 
            case 3 : 
                System.out.println(msg + "Domuz");
                break ; 
            case 4 : 
                System.out.println(msg + "Fare ");
                break ; 
            case 5 : 
                System.out.println(msg + "Öküz");
                break ; 
            case 6 : 
                System.out.println(msg + "Kaplan");
                break ; 
            case 7 : 
                System.out.println(msg + "Tavşan");
                break ; 
            case 8 : 
                System.out.println(msg + "Ejderha");
                break ; 
            case 9 : 
                System.out.println(msg + "Yılan");
                break ; 
            case 10 : 
                System.out.println(msg + "At");
                break ; 
            case 11: 
                System.out.println(msg + "Koyun");
                break ; 
            









        }

        



        
    }
}