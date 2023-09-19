import java.util.Scanner;

public class PRAK105_MarioFrancaWijaya_2210817310009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan Makanan Favorit: ");
        String Makan= input.nextLine();
        System.out.printf("Masukan Hobi: ");
        String Hobi= input.nextLine();

        System.out.println("Aku Suka Makan "+ Makan +", dan Hobiku "+ Hobi);
    }
}
