import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        double pi=3.14;
        Scanner input=new Scanner(System.in);
        double r,alan,cevre;
        System.out.println("Daire Çevresi ve Alanını Hesaplama");
        System.out.println("----------------------------------");
        System.out.print("Yarıçapı giriniz: ");
        r=input.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Dairenin alanı: "+alan+", dairenin çevresi: "+cevre);

        System.out.println("-----------------------------------------------");
        System.out.println("Yarıçap ve merkez açı ile daire alanı hesaplama");
        System.out.println("-----------------------------------------------");
        System.out.print("Yarıçapı giriniz: ");
        r=input.nextDouble();
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        double aci=input.nextDouble();
        alan=(pi*(r*r)*aci)/360;
        System.out.println("Dairenin alanı: "+alan);
    }
}
