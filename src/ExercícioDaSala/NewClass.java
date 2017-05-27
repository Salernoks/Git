package ExercícioDaSala;
 import java.util.Scanner;
  public class NewClass {
    public static void main (String [] args){
      Scanner leitor = new Scanner (System.in);
      
      int soma = 0;
      int co = 4;
      String n1;
       
      System.out.print("Digite um número: ");
        
      n1 = leitor.next();
           
      for (int i = 0; i < n1.length();i++){
            
          String d = n1.substring(i,i+1);
          int di = Integer.parseInt(d);
          
          soma = di*co;
          
          co = co - 1;
            
            
       }System.err.println("A soma dos caracteres é: "+soma);
    }
}
