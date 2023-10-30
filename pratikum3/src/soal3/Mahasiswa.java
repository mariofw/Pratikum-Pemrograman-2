package soal3;

import java.util.Scanner;
public class Mahasiswa {
    Scanner input = new Scanner(System.in);
    private String nama, nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void getData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM Mahasiwa(harus unik): ");
        nim = input.nextLine();
    }

}