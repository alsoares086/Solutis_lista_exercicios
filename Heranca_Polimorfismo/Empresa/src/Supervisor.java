public class Supervisor extends Funcionario{
    public Supervisor(String nome, int codigoFuncional, double rendaBasica) {
        super(nome, codigoFuncional, rendaBasica);
        adicionarComissao(600.0);
    }
    @Override
    public String toString() {
        return super.toString() + " Tipo: Supervisor," +
                " Comissão: " + getComissaoAdicional();
    }

}
