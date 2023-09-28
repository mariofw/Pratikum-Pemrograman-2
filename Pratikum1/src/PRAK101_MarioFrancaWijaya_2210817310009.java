import java.util.Scanner;

public class PRAK101_MarioFrancaWijaya_2210817310009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukkan Nama Lengkap: ");
        String Nama = input.nextLine();
        System.out.printf("Masukkan Tempat Lahir: ");
        String Tempat= input.nextLine();
        System.out.printf("Masukkan Tanggal Lahir: ");
        int TanggalLahir = input.nextInt();
        input.nextLine();
        System.out.printf("Masukkan bulan Lahir: ");
        int BulanLahir = input.nextInt();
        input.nextLine();
        System.out.printf("Masukkan Tahun Lahir: ");
        int TahunLahir = input.nextInt();
        input.nextLine();
        System.out.printf("Masukkan Tinggi Badan: ");
        int TinggiBadan = input.nextInt();
        input.nextLine();
        System.out.printf("Masukkan Berat Badan: ");
        float BeratBadan = input.nextFloat();
        input.nextLine();

        String monthString;
        switch (BulanLahir) {
            case 1: monthString = "January";break;
            case 2: monthString = "February";break;
            case 3: monthString = "March";break;
            case 4: monthString = "April";break;
            case 5: monthString = "May";break;
            case 6: monthString = "June";break;
            case 7: monthString = "July";break;
            case 8: monthString = "August";break;
            case 9: monthString = "September";break;
            case 10: monthString = "October";break;
            case 11: monthString = "November";break;
            case 12: monthString = "December";break;
            default: monthString = "Invalid month";break;
        }
        System.out.printf("Nama Lengkap %s, Lahir di %s Pada Tanggal %d %s %d Tinggi Badan %d cm dan Berat Badan %.2f Kilogram%n", Nama, Tempat, TanggalLahir, monthString, TahunLahir, TinggiBadan, BeratBadan);

        input.close();
    }
}
