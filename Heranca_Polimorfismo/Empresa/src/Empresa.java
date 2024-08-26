public class Empresa {
    public static void main(String[] args) {
        final double RENDA_BASICA = 1000.0;

        double custoBasico = 0;
        double custoMedio = 0;
        double custoGraduacao = 0;
        double custoTotal = 0;

        // Array de funcionários
        Funcionario[] funcionarios = new Funcionario[10];

        //Refaça o exercício 7 considerando que 10% dos funcionários são
        //Gerentes, 20% são supervisores e 70% são vendedores.
        for (int i = 0; i < 10; i++) {
            if (i < 1) {  // 1 Gerente
                funcionarios[i] = new Gerente("Gerente" + (i + 1),(i + 1), RENDA_BASICA);
                funcionarios[i].setEducacao(Educacao.GRADUACAO);
            } else if (i < 3) {  // 2 Supervisores
                funcionarios[i] = new Supervisor("Supervisor" + (i + 1), (i + 1), RENDA_BASICA);
                funcionarios[i].setEducacao(Educacao.MEDIO);
            } else {  // 7 Vendedores
                funcionarios[i] = new Vendedor("Vendedor" + (i + 1), (i + 1), RENDA_BASICA);
                funcionarios[i].setEducacao(Educacao.BASICO);
            }

            // Calculando o custo total da empresa
            double rendaTotal = funcionarios[i].getRendaTotal();
            custoTotal += rendaTotal;

            // Atualizando o custo por nível de escolaridade
            switch (funcionarios[i].getEducacao()) {
                case BASICO:
                    custoBasico += rendaTotal;
                    break;
                case MEDIO:
                    custoMedio += rendaTotal;
                    break;
                case GRADUACAO:
                    custoGraduacao += rendaTotal;
                    break;
            }
        }

        // Exibindo os custos
        System.out.println("Custos totais da empresa: R$" + custoTotal);
        System.out.println("Custos com funcionários de ensino básico: R$" + custoBasico);
        System.out.println("Custos com funcionários de ensino médio: R$" + custoMedio);
        System.out.println("Custos com funcionários de nível superior: R$" + custoGraduacao);
        System.out.println();

        System.out.println("Funcionários");
        // Imprimindo os funcionario conforme questao 11
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
