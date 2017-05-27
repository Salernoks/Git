package ExercícioDaSala;
  import java.util.Scanner;
    public class Arrays {
      public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
      int n = 10;
      int [] v = new int[n];
     
      for (int i = 0; i < n; i++){
         System.out.print("Digite um número: ");
         v[i] = leitor.nextInt();
    }
      int soma = 0;
      int menor = v[0];
      int maior = v[0];
      
      for (int i = 0; i < n; i++){
      soma = soma +v[i];
      
      if(v[i] < menor)
          menor = v[i];
      
      if(v[i] > maior){
          maior = v[i];
      }
    }
      for (int i = 0; i < n; i++){
          System.out.print("v[" +i+"]: " +v[i]);
          
          if(v[i] == menor)
              System.out.println(" <-- menor");
          else if(v[i] == maior)
              System.out.print(" <-- maior");
          
          
          System.out.println("");
    }
          System.out.println("A soma é: " + soma);
  }
}
