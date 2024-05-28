import java.util.Scanner;
public class dogukanyarimelGİTHUB1{
    public static void main(String[]args){

        int turkce , matematik , fenBilgisi , sosyalBilgisi , BedenEgitimi;
        double ortalama = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Türkçe Notunu giriniz : ");
        turkce = scan.nextInt();
        System.out.print("Fen Bilgisi Notunu giriniz : ");
        fenBilgisi = scan.nextInt();
        System.out.print("Matematik  Notunu giriniz : ");
        matematik = scan.nextInt();
        System.out.print("Sosyal Bilgisi Notunu giriniz : ");
        sosyalBilgisi = scan.nextInt();
        System.out.print("Beden Eğitimi Notunu giriniz : ");
        BedenEgitimi = scan.nextInt();
        ortalama = (turkce+fenBilgisi+sosyalBilgisi+BedenEgitimi ) / 5 ; 
        if(ortalama >50){            
            System.out.println("Sınıfta kaldınız.Seneye Görüşmek üzere . ");
            System.out.println("Sınıf ortalamanız : " + ortalama);
        }else { System.out.println("Tebrikler sınıfı başarılı bir şekilde geçtiniz . ");
                System.out.println("Sınıf ortalamanız : " + ortalama);
        }
        







    }




}

