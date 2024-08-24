public class Administrador extends Empregado{
    private double ajudaDeCustos;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCustos) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCustos = ajudaDeCustos;
    }

    public double getAjudaDeCustos() {
        return ajudaDeCustos;
    }

    public void setAjudaDeCustos(double ajudaDeCustos) {
        this.ajudaDeCustos = ajudaDeCustos;
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase() - (getSalarioBase() * (getImposto() / 100));
        return salario + ajudaDeCustos;
    }
}
