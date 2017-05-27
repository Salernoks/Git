package ExercícioDaSala;

import java.util.Scanner;

public class Exercício04 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        float kwc, kwh, r;
        System.out.print("Digite kwh: ");
        kwh = leitor.nextFloat();
        if (kwh<150){
            kwh = (kwh*0.20f);
        
            if (kwh<11.9f) {
                kwh = 11.9f;
            }
        }    
            else if ((kwh>=150)&&(kwh<500)) {
                kwh = kwh*0.25f;
        }
            else {
                kwh = kwh*0.30f;
            }
            System.out.println("O valor de kwh é: "+kwh);
            
        
        
        
        
        
        
        
    }
    
}
