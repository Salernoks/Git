package ExercícioDaSala;
 import java.util.Scanner;
  public class laçosanihados3 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
       for(int h = 0; h<=23; h++){
       for(int m = 0; m<=59; m++){
       for(int s = 0; s<=59; s++){
            System.out.printf("%d: %d: %d \n", h, m, s);      
       if(h==23 && m==55 && s==50){
            System.out.println("ALARME!!!");
            break;
          }
       if(s==0){
           break;
       }
        }
       if(m==20){
           break;
        }
      }
       if(h==4){
           break;
       }
    }
  }
}
