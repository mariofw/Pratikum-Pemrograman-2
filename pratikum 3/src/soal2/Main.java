package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nama = "", jenisKepem="", namaPemimpin="";
    int tanggal=0, bulan=0, tahun=0;
    Negara negara = new Negara(nama,jenisKepem,namaPemimpin,tanggal,bulan,tahun);
        LinkedList<Negara> newNegara = new LinkedList<>();

    int banyakN = input.nextInt();

    for (int x=0;x<banyakN;x++){
        Negara A = new Negara(nama,jenisKepem,namaPemimpin,tanggal,bulan,tahun);
        A.getData();
        newNegara.add(A);
    }
    for (int x=0;x<newNegara.size();x++){
        Negara B = newNegara.get(x);
        B.tampilkan();
    }
    }
}