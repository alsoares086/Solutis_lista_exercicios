import java.util.Scanner;

public class VerificarParOuImpar {
    public static void main(String[] args) {
        // Variáveis
        int numero;

        // Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor para verificar se é par ou ímpar:");
        numero = input.nextInt();

        if (numero % 2 == 0) 
        {
            System.out.println("O número informado é par.");
        } 
        else 
        {
            System.out.println("O número informado é ímpar.");
        }

        // Fechando o scanner
        input.close();
    }
}
