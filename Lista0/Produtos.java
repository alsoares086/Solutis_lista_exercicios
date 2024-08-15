import java.util.Scanner;

class Produtos {
    public static void main(String[] args) {
        // variáveis
        int codigo;
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o código do produto:");
        codigo = input.nextInt();

        // Utilizando estrutura if para retornar os produtos conforme o codigo informado
        if (codigo == 001)
        {
            System.out.println("00" + codigo + "? Parafuso");
        }

        else if (codigo == 002)
        {
            System.out.println("00" + codigo + "? Porca");
        }

        else if (codigo == 003)
        {
            System.out.println("00" + codigo + "? Prego");
        }
        
        else
        {
            System.out.println("00" + codigo + " ? Diversos");
        }

        input.close();
    }
}