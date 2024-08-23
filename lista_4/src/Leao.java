public class Leao extends AnimalTerrestreAB {
    public Leao(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, habitat, idade, altura, peso, quantidadePatas);
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
