import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, informe o raio da circunferência:");
        int raio = input.nextInt();

        double areaCirculo = (raio * raio) * 3.14;

        System.out.println("A área do círculo é: " + Math.round(areaCirculo));
        input.close();
    }
}