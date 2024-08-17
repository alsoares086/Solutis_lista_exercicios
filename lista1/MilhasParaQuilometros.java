
import java.util.Scanner;

class MilhasParaQuilometros {
    public static void main( String args[] ){
      //Scanner
      Scanner input = new Scanner(System.in);

      //variáveis
      double milhas = 0.0;

      System.out.println("Por favor, informe as milhas:");
      milhas = input.nextDouble();

      //1 milha = 1.609 km
      double quilometros = milhas * 1.609;

      System.out.println("Milhas: " + milhas);
      System.out.println("Quilômetros: " + quilometros);

      input.close();  
    
    }
}