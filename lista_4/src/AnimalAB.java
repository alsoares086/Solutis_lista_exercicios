public class AnimalAB implements AnimalIF {
    protected double comidaIngerida;
    protected double distanciaPercorrida;
    protected int horasDormidas;
    protected String nome;
    protected String tipoAnimal;
    protected String habitat;
    protected int idade;
    protected double altura;
    protected double peso;

    public AnimalAB(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.comidaIngerida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComidaIngerida() {
        return comidaIngerida;
    }

    public void setComidaIngerida(double comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Tipo: " + tipoAnimal +
                ", Habitat: " + habitat +
                ", Idade: " + idade +
                ", Altura: " + altura +
                ", Peso: " + peso +
                ", Comida Ingerida: " + comidaIngerida +
                ", Distância Percorrida: " + distanciaPercorrida +
                ", Horas Dormidas: " + horasDormidas;
    }
}
