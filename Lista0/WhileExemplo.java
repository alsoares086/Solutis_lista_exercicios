import java.util.Scanner;

public class WhileExemplo {
    public static void main(String[] args) {
        // Variáveis
        int count = 0;
        int soma = 0;
        int numero;
        
        // Scanner
        Scanner input = new Scanner(System.in);

        // com o while
       /* while (count < 50)
        {
            System.out.println("Informe o numero " + (count + 1) + ":");
            numero = input.nextInt();
            soma += numero;
            count ++;
        }*/

        // com o do while
        do
        {
            System.out.println("Informe o numero " + (count + 1) + ":");
            numero = input.nextInt();
            soma += numero;
            count ++;
        }while (count < 50);

        System.out.println(count);
        double media = (double) soma/count;
        
        //Exibindo a média
        System.out.println("Média aritmética: " + media);

        input.close();

    }
}
