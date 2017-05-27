package ExercícioDaSala;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
        int n1, r;
        System.out.print("Digite um número: ");
        n1 = leitor.nextInt();
        if(n1>100){
            r = n1+150;  
            System.out.println("Soma: "+r);
        } else {System.out.println("FATAL ERROR");
        
        }
    }
}

           
        
        
        
    
    

