import java.util.Scanner;
public class CompararPalavras{
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //variáveis
        String palavra1;
        String palavra2;

        System.out.println("Informe a primeira palavra:");
        palavra1 = input.nextLine();
        System.out.println("Informe a segunda palavra:");
        palavra2 = input.nextLine();

        //convertando as palavras para evitar erros na comparação alfabética
        palavra1 = palavra1.toLowerCase();
        palavra2 = palavra2.toLowerCase();

        //Comparação alfabética
        int comparacaoAlfabetica = palavra1.compareTo(palavra2);

        if (comparacaoAlfabetica == 0)
            System.out.println("Palavras são iguais");
        else if (comparacaoAlfabetica < 0 ){
            System.out.println("Ordem alfabética:"
            + "\n1- " + palavra1
            + "\n2- " + palavra2);
        }
        else{
            System.out.println("Ordem alfabética:"
            + "\n1- " + palavra2
            + "\n2- " + palavra1);         
        }

        // Comparação do número de caracteres
        int tamanhoPalavra1 = palavra1.length();
        int tamanhoPalavra2 = palavra2.length();

        if (tamanhoPalavra1 > tamanhoPalavra2) 
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        else if (tamanhoPalavra2 > tamanhoPalavra1) 
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        else 
            System.out.println("As duas palavras têm o mesmo número de caracteres.");    

        input.close();
    }
}