public class Vendedor extends Funcionario{
    public Vendedor(String nome, int codigoFuncional, double rendaBasica) {
        super(nome, codigoFuncional, rendaBasica);
        adicionarComissao(250.0);
    }
    @Override
    public String toString() {
        return super.toString() + " Tipo: Vendedor," +
                " Comissão: " + getComissaoAdicional();
    }
}
