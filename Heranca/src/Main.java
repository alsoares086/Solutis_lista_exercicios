public class Main {
    public static void main(String[] args) {

        //testando a classe Fornecedor
        Fornecedor fornecedor = new Fornecedor("Marcio da Silva", "11 999999999", "Rua ABC, Bairro 123", 3.0, 5.0);
        System.out.println("Testando a classe Fornecedor:");
        System.out.println("Saldo restante: " + Fornecedor.obterSaldo(5.0, 3.0));

        //testando a classe Empregado
        Empregado empregado = new Empregado("Antonio Soares", "Rua Sobral, Bairro Fortaleza","11 964587123", 1, 5000.0, 20);
        System.out.println("\nTestando a classe Empregado:");
        System.out.println("Salario do Empregado: " + empregado.calcularSalario());

        //testanto a classe Administrador
        Administrador administrador = new Administrador("Jose Peixoto", "Rua Chico Mendas, Bairro Floresta", "11 987563214", 2, 5000.0, 20.0, 1000.0);
        System.out.println("\nTestando a classe Administrador:");
        System.out.println("Salario do Administrador: " + administrador.calcularSalario());

        //testanto a classe Operario
        Operario operario = new Operario("Mario Bros", "Rua dos cogumelos, Bairro da Estrela", "11 996743685", 3, 5000.0, 10.0, 1000.0, 10.0);
        System.out.println("\nTestando a classe Operario:");
        System.out.println("Salario do Operario: " + operario.calcularSalario());

        //testanto a classe Vendedor
        Vendedor vendedor = new Vendedor("Luigi", "Rua dos cogumelos, Bairro da Estrela", "11 996743686", 4, 5000.0, 15.0, 3000.0, 15.0);
        System.out.println("\nTestando a classe Vendedor:");
        System.out.println("Salario do Vendedor: " + vendedor.calcularSalario());
    }
}