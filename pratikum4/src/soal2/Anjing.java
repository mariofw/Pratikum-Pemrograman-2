package soal2;

public class Anjing extends HewanPeliharaan {
    String warnaBulu, kemampuan;

    public Anjing(String nama, String ras, String warnaBulu, String kemampuan) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }

    public void displayDetailAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu : "+this.warnaBulu);
        System.out.println("Memiliki kemampuan : "+this.kemampuan);
    }
}
