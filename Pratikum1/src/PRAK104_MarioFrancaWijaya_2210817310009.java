import java.util.Scanner;

public class PRAK104_MarioFrancaWijaya_2210817310009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Tangan Abu: ");
        String TanganAbu = input.nextLine().toUpperCase().replaceAll(" ", "");
        System.out.printf("Tangan Bagas: ");
        String TanganBagas = input.nextLine().toUpperCase().replaceAll(" ", "");

        int pointabu=0,pointbagas=0;
        for(int i=0;i<3;i++){
            char PAbu = TanganAbu.charAt(i);
            char PBagas = TanganBagas.charAt(i);

            if (((PAbu == 'B' && PBagas == 'G') || (PAbu == 'G' && PBagas == 'K') || (PAbu == 'K' && PBagas == 'B'))){
                pointabu++;
            }else if(PAbu==PBagas){
            }else {
                pointbagas++;
            }
        }
        if (pointabu==pointbagas){
            System.out.printf("Seri");
        } else if (pointabu>pointbagas) {
            System.out.printf("Abu");
        }else {
            System.out.printf("Bagas");
        }
    }
}