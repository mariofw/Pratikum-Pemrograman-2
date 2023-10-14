 //Pada baris ke-4 mengalami error, karena pada public class nya tidak sesuai dengan nama file java nya, jadi sesuaikan dengan nama file yang telah ditentukan pada soal yaitu 'Pegawai'
//public class Employee {
    public class Pegawai {
        public String nama;
        //Pada baris ke-8, property asal tidak menggunakan tipe data char, tetapi menggunakan tipe data String karena menyimpan berbagai karakter huruf (kata)
        //public char asal;
        public String asal;
        public String jabatan;
        public int umur;
        public String getNama() {
            return nama;
        }

        //Pada baris ke-17 akan terjadi error bila property 'asal' masih tipe data char, setelah tipe data property 'asal' menjdi String, baris ke-17 ini dapat dijalankan
        public String getAsal() {
            return asal;
        }

        //Pada baris ke-22 terjadi error karena belum ada pendeklarasian variabel j. Jadi lakukan pendeklarasian terlebih dahulu untuk variabel j.
        //public void setJabatan() {
        public void setJabatan(String j) {
            this.jabatan = j;
        }

    }
