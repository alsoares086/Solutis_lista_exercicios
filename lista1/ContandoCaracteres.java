import java.text.Normalizer;
import java.util.Scanner;
public class ContandoCaracteres{
    public static void main(String[] args) {
        //variáveis
        int vogais = 0;
        int consoantes = 0;
        int espacos = 0;

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase = input.nextLine();

        // Convertendo para minúsculo e removendo acentos
        frase = frase.toLowerCase();
        frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
        frase = frase.replaceAll("[\\p{M}]", "");


        //loop para encontrar vogais, consoantes e espaços na frase
        for (int i = 0; i < frase.length(); i++)
        {
            char caractere = frase.charAt(i);

            if(caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u')
                vogais ++;
            else if (caractere == ' ')
                espacos++;
            else if (caractere >= 'a' && caractere <= 'z')
                consoantes++;         
        }

        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
        System.out.println("Número de espaços: " + espacos);
    }
}