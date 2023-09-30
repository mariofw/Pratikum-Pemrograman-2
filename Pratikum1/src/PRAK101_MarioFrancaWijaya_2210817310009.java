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
        System.out.printf("Masukkan bulan Lahir: ");
        int BulanLahir = input.nextInt();
        System.out.printf("Masukkan Tahun Lahir: ");
        int TahunLahir = input.nextInt();
        System.out.printf("Masukkan Tinggi Badan: ");
        int TinggiBadan = input.nextInt();
        System.out.printf("Masukkan Berat Badan: ");
        float BeratBadan = input.nextFloat();

        String BulanString;
        switch (BulanLahir) {
            case 1: BulanString = "Januari";break;
            case 2: BulanString = "Februari";break;
            case 3: BulanString = "Maret";break;
            case 4: BulanString = "April";break;
            case 5: BulanString = "Mei";break;
            case 6: BulanString = "Juni";break;
            case 7: BulanString = "Juli";break;
            case 8: BulanString = "Agustus";break;
            case 9: BulanString = "September";break;
            case 10: BulanString = "Oktober";break;
            case 11: BulanString = "November";break;
            case 12: BulanString = "Desember";break;
            default: BulanString = "Invalid";break;
        }
        System.out.printf("Nama Lengkap %s, Lahir di %s Pada Tanggal %d %s %d Tinggi Badan %d cm dan Berat Badan %.2f Kilogram%n", Nama, Tempat, TanggalLahir, BulanString, TahunLahir, TinggiBadan, BeratBadan);
    }
}
