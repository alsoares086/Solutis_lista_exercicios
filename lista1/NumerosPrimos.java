import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        //variaveis
        int numero;
        //Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");        
        numero = input.nextInt();

        while(numero <= 1)
        {
            System.out.println("Número deve ser positivo e maior que 1.");
            System.out.println("Digite um número inteiro: ");        
            numero = input.nextInt(); 
        }
        
        System.out.println("Números primos menores que " + numero + ":");

        for (int i = 2; i < numero; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
             
        input.close();
    }
    
}
