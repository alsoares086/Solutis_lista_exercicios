public class Multiplos {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {

            //Se o modulo for  igual a 0 significa que o número é divisível por 3, ou seja, um múltiplo
            if(i % 3 == 0) {
                System.out.println("Divisão de " + i + "por 2 (int): " + (i / 2));
                System.out.println("Divisão de " + i + "por 2 (double): " + (i / 2.0));
                System.out.println();
            }
        }
    }
}
