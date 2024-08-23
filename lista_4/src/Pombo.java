public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso, int quantidadeAsas, double envergaduraAsas) {
        super(nome, tipoAnimal, habitat, idade, altura, peso, quantidadeAsas, envergaduraAsas);
    }


    @Override
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
        return super.toString();
    }
}
