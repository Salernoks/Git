package ExercícioDaSala;
import java.util.Random;
 import java.util.Scanner;
   public class Jogo {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random ();
             
             String alternativa = "";
             
             int  pergunta = 0, questao = 0, tentativas = 3 , pontos = 0 ;
       
             boolean resposta = false;
             
        do{
          
          questao = aleatorio.nextInt(3);           
            
          if(questao == 1){  
                System.out.println(" !!pergunta!! " + "\n");

                System.out.println("Qual o nome do primeiro avião de Santos Dumont? ");

                System.out.println("A- Bis ");
                System.out.println("B- verme ");
                System.out.println("C- avião do forró");
                System.out.println("D- A bunda do Rafael" + "\n");
                System.out.println("RESPOSTA !" );

                alternativa = leitor.next();

                switch(alternativa){

                  case "a":

                        resposta = true;
                        pontos = pontos + 30;
                        System.out.println("resposta correta ");
                        System.out.println("pontos: "+pontos);
                        break;
                  case "b":
                  case "c":
                  case "d":    
                        System.out.println("Resposta .......... !!ERRADA!! ");
                        tentativas = tentativas - 1;
                  break;                 

                  default:
                        System.out.println("Essa alternativa não existe "); 
                }
            
          }else if(questao == 2){  
                            
                            System.out.println(" !!pergunta!! " + "\n");

                            System.out.println("Qual o nome do LULA? ");

                            System.out.println("A- luiz ");
                            System.out.println("B- inacio ");
                            System.out.println("C- lula");
                            System.out.println("D- Silva" + "\n");
                            System.out.println("RESPOSTA !" );

                            alternativa = leitor.next();

                            switch(alternativa){

                              case "a":
                              case "d":
                              case "b":
                                    System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1;                        
                                    break;

                              case "c":
                                    resposta = true;
                                    pontos = pontos + 30;
                                    System.out.println("resposta correta ");
                                    System.out.println("pontos: "+pontos);

                              break;                 

                              default:
                                    System.out.println("Essa alternativa não existe ");              
                            }    
             
                }
                  
        }while(!resposta);        
          
                      
    }
}
        
