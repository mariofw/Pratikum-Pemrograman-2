import java.util.Scanner;

public class PRAK102_MarioFrancaWijaya_2210817310009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("input");
        int inputan= input.nextInt();
        int x=inputan+10;

        for(int i=inputan;i<=x;i++){
            int y=i%5;
            if (y==0){
                System.out.println(i/5-1);;
            }else {
                System.out.println(i);
            }

        }
    }
}
