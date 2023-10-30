package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dd = new Dadu();
        int jmlhDadu = input.nextInt();

        dd.setInput(jmlhDadu);
        dd.acakDadu();
    }
}
