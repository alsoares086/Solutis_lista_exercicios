public class AnimalTerrestreAB extends AnimalAB {
    private int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, habitat, idade, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }


    public void andar(double distancia) {
        // Adiciona a distância percorrida ao andar
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
        return super.toString() + ", Quantidade de Patas: " + quantidadePatas;
    }

}
