public class LancamentoDados {
    public static void main(String[] args) {
        int resultado;    
        System.out.println("Possibilidades de soma 7 com dois dados:");
    
            for (int dado1 = 1; dado1 <= 6; dado1++) {
                for (int dado2 = 1; dado2 <= 6; dado2++) {
                    resultado = dado1 + dado2;
                    // Verificando se a soma dos dois dados é igual a 7
                    if (resultado == 7) 
                        System.out.println( dado1 + " + " + dado2 + " = " + resultado); 
                }
            }
    }
}
