public class Gerente extends Funcionario {
    public Gerente(String nome, int codigoFuncional, double rendaBasica) {
        super(nome, codigoFuncional, rendaBasica);
        adicionarComissao(1500.0);
    }
    @Override
    public String toString() {
        return super.toString() + " Tipo: Gerente," +
                " Comissão: " + getComissaoAdicional();
    }
}
