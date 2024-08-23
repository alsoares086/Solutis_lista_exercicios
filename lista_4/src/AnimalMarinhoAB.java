public class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso) {
        super(nome, tipoAnimal, habitat, idade, altura, peso);
    }

    public void nadar(double distancia) {
        // Adiciona a distância percorrida ao nadar
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
