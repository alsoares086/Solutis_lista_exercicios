public class AnimalVoadorAB extends AnimalAB {
    private int quantidadeAsas;
    private double envergaduraAsas;

    public AnimalVoadorAB(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso, int quantidadeAsas, double envergaduraAsas) {
        super(nome, tipoAnimal, habitat, idade, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    public void voar(double distancia) {
        // Adiciona a distância percorrida ao voar
        this.distanciaPercorrida += distancia;
    }

    @Override
    public double comer(double comidaIngerida) {
        return comidaIngerida;
    }

    @Override
    public double moverse(double distanciaPercorrida) {
        return distanciaPercorrida;
    }

    @Override
    public int dormir(int horasDormidas) {
        return horasDormidas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Quantidade de Asas: " + quantidadeAsas
                + ", Envergadura Asas: " + envergaduraAsas;
    }
}
