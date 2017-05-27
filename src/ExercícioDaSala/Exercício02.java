package ExercícioDaSala;

import java.util.Scanner;

public class Exercício02 {
   public static void main(String[] args){
       Scanner leitor = new Scanner(System.in);
      float n1, n2, r;
       System.out.print("Digite um número: ");
       n1 = leitor.nextFloat();
       System.out.print("Digite outro número: ");
       n2 = leitor.nextFloat();
       r = n1 % n2;
       if (r == 0){
           System.out.println("Divisão  exata");
            }
       else{ 
           System.out.println("Divisão não exta");
           
           
       }
       
         
       
   }
   
}
