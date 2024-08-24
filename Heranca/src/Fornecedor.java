public class Fornecedor extends Pessoa {

    private double valorDivida;
    private double valorCredito;

    public Fornecedor(String nome, String telefone, String endereco, double valorDivida, double valorCredito){
        super(nome, telefone, endereco);
        this.valorDivida = valorDivida;
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public static double obterSaldo(double valorCredito, double valorDivida){
        return valorCredito - valorDivida;
    }
}
