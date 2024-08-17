import java.util.Scanner;

class DiasDaSemana {
    public static void main( String args[] ){
        //Array
        String[] semana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        //variáveis
        int num;
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione um número:"
        + "\n 1- Segunda"
        + "\n 2- Terça"
        + "\n 3- Quarta"
        + "\n 4- Quinta"
        + "\n 5- Sexta"
        + "\n 6- Sábado"
        + "\n 7- Domingo");
        num = input.nextInt();

        System.out.println("Hoje é " + semana[num]);
        
    }
}