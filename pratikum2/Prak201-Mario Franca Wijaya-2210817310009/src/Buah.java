public class Buah {
        // Atribut dan Tipe Data
        String nama;
        double berat, jumlahBeli,hargaSebelumDiskon,totalDiskon,hargaSesudahDiskon,harga;
        public Buah(String namaBuah, double beratBuah, double hargaBuah, double jumlahBeli){
            this.nama = namaBuah;
            this.berat = beratBuah;
            this.harga = hargaBuah;
            this.jumlahBeli = jumlahBeli;
            this.hargaSebelumDiskon = harga*(jumlahBeli/beratBuah);
            this.totalDiskon = (int)(jumlahBeli/4)*(4*harga)*0.02;
            this.hargaSesudahDiskon = hargaSebelumDiskon-totalDiskon;
        }

        public void display(){
            System.out.println("Nama Buah: "+nama);
            System.out.println("Berat: "+berat);
            System.out.println("Harga: "+harga);
            System.out.println("jumlah Beli: "+jumlahBeli+"kg");
            System.out.printf("Harga Sebelum Diskon: Rp%.2f\n",hargaSebelumDiskon);
            System.out.printf("Total Diskon: Rp%.2f\n",totalDiskon);
            System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n",hargaSesudahDiskon);
        }
    }


