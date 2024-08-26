public class Veterinario {
    private String nome;
    private int ID;

    public Veterinario(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void examinar(Animal animal) {
        System.out.print(animal.getNome() + " está sendo examinado e ele(a) ");
        System.out.println(animal.getSom());
    }
}
