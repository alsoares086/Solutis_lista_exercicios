import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Animais
       Cavalo cavalo = new Cavalo ("Rex", 5);
       Cachorro cachorro = new Cachorro ("Estrela", 3);
       Preguica preguica = new Preguica ("Nick", 15);

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        for (Animal animal : animais) {
            System.out.println("\n" + animal.getNome() + " " + animal.getSom());
         }

        //Consulta no veterinario
        Veterinario veterinario = new Veterinario("Fulano",1);
        for (Animal animal : animais) {
            veterinario.examinar(animal);
        }

        //Zoologico
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(0, cavalo);
        zoologico.adicionarAnimal(1, cachorro);
        zoologico.adicionarAnimal(2, preguica);

        // Percorrendo as jaulas e emitindo os sons dos animais
        zoologico.percorrerJaulas();
    }
}