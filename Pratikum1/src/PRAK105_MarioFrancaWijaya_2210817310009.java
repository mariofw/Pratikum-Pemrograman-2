import java.util.Scanner;

public class PRAK105_MarioFrancaWijaya_2210817310009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukkan jari-jari: ");
        double jari = input.nextFloat();
        System.out.printf("Masukkan tinggi: ");
        double tinggi = input.nextFloat();
        double phi = 3.14;

        double hasil = phi * jari * jari * tinggi;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jari, tinggi, hasil);
    }
}
    //public static void main(String[] args) {final double phi = 3.14;}