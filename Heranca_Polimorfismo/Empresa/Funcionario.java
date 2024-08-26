public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private Educacao educacao;
    private String institutoEducacao;
    private double rendaBasica;
    private double rendaTotal;
    private double comissaoAdicional;

    public Funcionario(String nome, int codigoFuncional, double rendaBasica) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.educacao = Educacao.NENHUM;
        this.institutoEducacao = null;
        this.rendaBasica = rendaBasica;
        this.rendaTotal = rendaBasica;
        this.comissaoAdicional = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Educacao getEducacao() {
        return educacao;
    }

    public void setEducacao(Educacao educacao) {
        this.educacao = educacao;
        atualizarRendaTotal();
    }

    public String getInstitutoEducacao() {
        return institutoEducacao;
    }

    public void setInstitutoEducacao(String institutoEducacao) {
        this.institutoEducacao = institutoEducacao;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
        atualizarRendaTotal();
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public double getComissaoAdicional() {
        return comissaoAdicional;
    }

    public void setComissaoAdicional(double comissaoAdicional) {
        this.comissaoAdicional = comissaoAdicional;
        atualizarRendaTotal();
    }

    public void adicionarComissao(double comissao) {
        this.comissaoAdicional = comissao;
        atualizarRendaTotal();
    }

    private void atualizarRendaTotal() {
        switch (educacao) {
            case BASICO:
                rendaTotal = rendaBasica * 1.10;
                break;
            case MEDIO:
                rendaTotal = rendaTotal * 1.50;
                break;
            case GRADUACAO:
                rendaTotal = rendaTotal * 2.00;
                break;
            default:
                rendaTotal = rendaBasica;
                break;
        }

        rendaTotal += comissaoAdicional;
    }

    private String getInstituicaoTipo() {
        switch (educacao) {
            case BASICO:
            case MEDIO:
                return "Escola";
            case GRADUACAO:
                return "Faculdade";
            default:
                return "N/A";
        }
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                ", Codigo: " + codigoFuncional +
                ", Educacao: " + educacao + ", " +
                getInstituicaoTipo() +
                ", Renda Básica: " + rendaBasica +
                ", Renda Total: " + rendaTotal;
    }
}
