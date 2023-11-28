package soal1;

import java.util.Scanner;

public class HewanPeliharaan {
    String nama, ras;

    public HewanPeliharaan(String nama, String ras) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        nama = input.nextLine();
        this.nama = nama;
        System.out.print("Ras: ");
        ras = input.nextLine();
        this.ras = ras;
    }

    public void display(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : "+this.nama);
        System.out.println("Dengan ras : "+this.ras);
    }
}