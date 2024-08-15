import java.util.Scanner;

public class TrocarNumeros {
    public static void main(String[] args) {
        // Variáveis
        int a;
        int b;

        // Scanner
        Scanner input = new Scanner(System.in); 

        // Entrada do primeiro número
        System.out.println("Informe o primeiro número:");
        a = input.nextInt();

        // Entrada do segundo número
        System.out.println("Informe o segundo número:");
        b = input.nextInt();

        while(a == b)
        {
            System.out.println("Valores devem ser diferentes.");
            
            // Entrada do primeiro número
            System.out.println("Informe o primeiro número:");
            a = input.nextInt();

            // Entrada do segundo número
            System.out.println("Informe o segundo número:");
            b = input.nextInt();
        }

        System.out.println("Antes da troca:");
        System.out.println("Primeiro valor: " + a);
        System.out.println("Segundo valor: " + b);

        // Troca dos valores
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Após a troca:");
        System.out.println("Primeiro valor: " + a);
        System.out.println("Segundo valor: " + b);

        // Fechando o scanner
        input.close();
    }

}
