package soal2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Negara {
    private String nama,jenisKepem,namaPemimpin;
    private int tanggal,bulan,tahun;

    public Negara(String nama, String jenisKepem, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepem = jenisKepem;
        this.namaPemimpin = namaPemimpin;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getBulan(){
        return bulan;
    }

    public void getData(){
        Scanner input = new Scanner(System.in);
        nama=input.nextLine();
        jenisKepem=input.nextLine();
        namaPemimpin=input.nextLine();
        if (jenisKepem.equalsIgnoreCase("presiden")||jenisKepem.equalsIgnoreCase("perdana menteri")) {
            tanggal = input.nextInt();
            bulan = input.nextInt();
            tahun = input.nextInt();
        }
    }

    public void tampilkan() {
        Map<Integer, String> namaB = new HashMap<>();
        namaB.put(1, "Januari");
        namaB.put(2, "Februari");
        namaB.put(3, "Maret");
        namaB.put(4, "April");
        namaB.put(5, "Mei");
        namaB.put(6, "Juni");
        namaB.put(7, "Juli");
        namaB.put(8, "Agustus");
        namaB.put(9, "September");
        namaB.put(10, "Oktober");
        namaB.put(11, "November");
        namaB.put(12, "Desember");
        if (jenisKepem.equalsIgnoreCase("presiden")||jenisKepem.equalsIgnoreCase("perdana menteri")){
            System.out.println("Negara "+nama+" mempunyai "+jenisKepem+" bernama "+namaPemimpin);
        } else if (jenisKepem.equalsIgnoreCase("monarki")) {
            System.out.println("Negara "+nama+" mempunyai Raja bernama "+namaPemimpin+"\n");
        }
        if (jenisKepem.equalsIgnoreCase("presiden")||jenisKepem.equalsIgnoreCase("perdana menteri")){
            System.out.println("Deklarasi Kemerdekaan pada tanggal "+tanggal+" "+namaB.get(getBulan())+" "+tahun+"\n");
        }
    }

}
