import java.util.Scanner;

class MaiorNumero {
    public static void main( String args[] ){
    
    //variaveis
    int num1;
    int num2;

    //Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Informe o primeiro número:");
    num1 = input.nextInt();

    System.out.println("Informe o segundo número:");
    num2 = input.nextInt();

    while (num1 == num2)
    {
        System.out.println("Valores devem ser diferentes.");
        System.out.println("Informe o primeiro número:");
        num1 = input.nextInt();

        System.out.println("Informe o segundo número:");
        num2 = input.nextInt();
    }

    int maiorValor = Math.max(num1, num2);

    System.out.println("O maior valor é " + maiorValor);

    }
}