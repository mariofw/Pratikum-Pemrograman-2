import java.util.Scanner;
public class PRAK102_MarioFrancaWijaya_2210817310009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("input: ");
        int inputan = input.nextInt();
        int i = 0;

        while (i < 11) {
            if (inputan % 5 == 0) {
                System.out.printf("%d", inputan / 5 - 1);
            } else {
                System.out.printf("%d", inputan);
            }
            if (i < 10) {
                System.out.printf(",");
            }
            i++;
            inputan++;
        }
    }
}