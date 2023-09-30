import java.util.Scanner;
public class PRAK103_MarioFrancaWijaya_2210817310009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan Nilai N dan Bilangan Awal: ");
        int N = input.nextInt();
        int BilAwal = input.nextInt();

        int i = 0, x = BilAwal;
        do {
            if (x % 2 != 0) {
                System.out.printf("%d", x);
                if (i<N-1){
                    System.out.printf(", ");
                }
                i++;
            }
            x++;
        } while (i < N);
    }
}