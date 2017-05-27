package ExercícioDaSala;
 import java.util.Scanner;
  public class tratamnetodeERRO {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        double temp;
        boolean valido = false;
        do{
    try{    
         System.out.print("Digite a temperatura: ");
         temp = Double.parseDouble(leitor.nextLine());
         valido = true;
    }catch (NumberFormatException ex) {
        System.err.println("Temperatura inválida");
     }
    }while (!valido);
  }
}
  
    
  

    

