import java.util.Scanner;
public class ConsumoGasolina{
    public static void main(String[] args) {
        //variaveis
        int quilometrosDirigidos;
        int litrosConsumidos;
        int quilometragemTotal = 0;
        int totalLitrosConsumidos = 0;
        char escolha;
        //Scanner
        Scanner input = new Scanner(System.in);

            //loop para coletar a gasolina e quilometragem de todos os tanques de gasolina
            do {
            
            System.out.println("Quantos quilômetros você dirigiu?");
            quilometrosDirigidos = input.nextInt();

            System.out.println("Quantos litros de gasolina foram consumidos durante sua viagem?");
            litrosConsumidos = input.nextInt();

           
            float consumo = (float) quilometrosDirigidos / litrosConsumidos;
            System.out.printf("\nO consumo para este tanque foi de " + consumo + "km/L");

            
            quilometragemTotal += quilometrosDirigidos;
            totalLitrosConsumidos += litrosConsumidos;

            // Perguntar se o usuário quer continuar
            System.out.println("\nDeseja registrar outro tanque? (s/n)");
            escolha = input.next().charAt(0);
            escolha = Character.toLowerCase(escolha);

        } while (escolha == 's');

        System.out.println("Quilometragem total: " + quilometragemTotal);
        System.out.println("Total de litros consumidos: " + totalLitrosConsumidos);

        input.close();
    }
}