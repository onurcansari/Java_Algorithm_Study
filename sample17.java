// Dönem Sonu Notunuzu ve Bütünleme Durumunuzu Bulma
import java.util.Scanner;

public class sample17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Vize Notunuzu Giriniz");
        int vize = input.nextInt();
        System.out.println("Lütfen Final Notunuzu Giriniz");
        int Final = input.nextInt();

        double not =(vize * 0.4) + (Final * 0.6);

        System.out.println("Notunuz: " + not);
        if (not < 50){
            System.out.println("Kaldınız Geçmiş Olsun");
        }else if (not >= 50){
            System.out.println("Tebrikler Geçtiniz");
        }

    }
}
