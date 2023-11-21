package soal2;

public class Kucing extends HewanPeliharaan{
    String warnaBulu;

    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
    }

    public void displayDetailKucing(){
        super.display();
        System.out.println("Memiliki warna bulu : "+this.warnaBulu);
    }
}
