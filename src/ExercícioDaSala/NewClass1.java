package ExercícioDaSala;
public class NewClass1 {
    public static void main (String [] aegs){
        double n = 1;
        double soma = 0;
        System.out.println("soma da divisão dos  ímpares de 1 até chegar no 10.000: ");
        for (int i = 1; i <= 10000; i++){
            soma = soma + 1/n;
            n = n + 2;
        }System.out.println(soma);
    }
}
