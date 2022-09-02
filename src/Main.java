
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int mat , fiz ;

        Scanner inp = new Scanner(System.in);

        System.out.println("mat not");
        mat =inp.nextInt();

        System.out.println("fiz not");
        fiz= inp.nextInt();

        int top= (mat+fiz);
        double sonuc = top / 2;
        System.out.println("ortalama :" + sonuc);

        if(sonuc < 50) {
            System.out.println("kaldİ");

        }
        else {
            System.out.println("GECTİ");
        }



    }


}