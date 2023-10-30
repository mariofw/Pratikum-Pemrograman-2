package soal1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Dadu {
    public int input,total;
    Random rand = new Random();

    public void setInput(int input){
        this.input=input;
    }

    public void acakDadu(){
        Collection Dadu = new LinkedList<Integer>();
        Dadu.add(1);Dadu.add(2);Dadu.add(3);Dadu.add(4);Dadu.add(5);Dadu.add(6);
        for(int x=1; x <= input;x++){
            int dice = rand.nextInt(6)+1;
            System.out.println("Dadu ke-"+x+" Bernilai "+dice);
            total += dice;
        }
        System.out.println("Total nilai dadu keseluruhan "+ total);
    }
}