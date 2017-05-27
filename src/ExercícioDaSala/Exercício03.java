package ExercícioDaSala;

import java.util.Scanner;

public class Exercício03 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        double a, p, m;
        System.out.print("Digite sua peso: ");
        a = leitor.nextDouble();
        System.out.print("Digite seu altura: ");
        p = leitor.nextDouble();
        m = a/(p*p);
        if (m <26){
            System.out.println("Você está dentro do peso.");
        }else if ((m >= 26) && (m <30)){
                
            System.out.println("Você está acima do peso.");
        }else{ 
            System.out.println("Você está com obesidade.");

}
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
    }
    
}
