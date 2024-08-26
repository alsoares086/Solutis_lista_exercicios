public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String som;
    protected String acao;

    // Construtor padrão
    public Animal() {
        this.nome = "";
        this.idade = 0;
        this.som = "";
        this.acao = "";
    }

    // Construtor com parâmetros
    public Animal(String nome, int idade, String som, String acao) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
        this.acao = acao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}
