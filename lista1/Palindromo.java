import java.util.Scanner;
public class Palindromo{
    public static void main( String args[] ){ 
        //variaveis
        String palavra;
        String palindroma = "";
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, informe uma palavra e verifique se ela é palíndroma:");
        palavra = input.nextLine();

        for (int i = (palavra.length() -1); i >= 0; i--) {
            palindroma = palindroma + palavra.charAt(i);
        }        
        
        if (palindroma.toLowerCase().equals(palavra.toLowerCase()))
            System.out.println("Essa palavra é palíndroma :" + palindroma.toLowerCase());
        else 
            System.out.println("Essa palavra não é palíndroma: " + palindroma.toLowerCase());
        
        input.close();
    }      
}