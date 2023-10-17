//Public class terjadi error karena berbeda dengan nama file .java
//public class Employee{}
public class Pegawai {
    public String nama;
    //Ubah tipe data menjadi String
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama(){
        return nama;
    }
    //Pada baris ini sebelumnya error karena tipe data sebelumnya char maka harus diganti dengan String agar kompatibel
    public String getAsal(){
        return asal;
    }
    //Terjadi error karena sebelumnya tidak ada pendeklarasian variabel j
    //public void setJabatan(){
    public void setJabatan(String j){
        this.jabatan=j;
    }
}