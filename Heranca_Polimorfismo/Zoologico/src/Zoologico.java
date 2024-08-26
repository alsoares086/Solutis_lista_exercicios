public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.print("Jaula " + (i+1) + ": " + animal.getNome() + " " + animal.getSom());

                // Verificar se a ação é "correr"
                if ("corre".equalsIgnoreCase(animal.getAcao())) {
                    System.out.println("\n" + animal.getNome() + " pode correr.");
                } else {
                    System.out.println("\n" +animal.getNome() + " não pode correr.");
                }
            }
        }
    }
}
