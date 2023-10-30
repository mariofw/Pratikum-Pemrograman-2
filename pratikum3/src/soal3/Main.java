package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama = "", nim="", hapus;
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasaekan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan){
                case 1:
                    Mahasiswa A = new Mahasiswa(nama, nim);
                    A.getData();
                    mahasiswaList.add(A);
                    System.out.println("Mahasiswa "+ A.getNama() +" telah ditambahkan.");
                    continue;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    hapus = input.nextLine();
                    Mahasiswa hapusMaha = null;
                    for (Mahasiswa m : mahasiswaList){
                        if (m.getNim().equalsIgnoreCase(hapus)){
                            hapusMaha = m;
                            break;
                        }
                    }
                    if (hapusMaha != null){
                        mahasiswaList.remove(hapusMaha);
                        System.out.println("Mahasiswa dengan NIM "+hapus+" dihapus");
                    }else {
                        System.out.println("Mahasiswa dengan NIM "+hapus+" tidak ditemukan");
                    }
                    continue;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan di cari: ");
                    String cari = input.nextLine();
                    boolean cariMaha = false;
                    for (Mahasiswa m : mahasiswaList){
                        if (m.getNim() .equalsIgnoreCase(cari)){
                            System.out.println("Data Mahasiswa dengan NIM "+m.getNim()+" adalah "+m.getNama());
                            cariMaha = true;
                            break;
                        }
                    }
                    if (!cariMaha){
                        System.out.println("Mahasiswa dengan NIM "+cari+" tidak ditemukan");
                    }
                    continue;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa m : mahasiswaList){
                        System.out.println("NIM: "+m.getNim()+", Nama: "+m.getNama());
                    }
                    continue;

                case 0:
                    mahasiswaList.clear();
                    System.out.println("Terima kasih!");
                    System.exit(0);

                default:
                    System.out.println("Input tidak valid");
            }

        }
    }
}