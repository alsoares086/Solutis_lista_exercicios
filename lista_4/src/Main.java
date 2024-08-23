public class Main {
    public static void main(String[] args) {
        // Instâncias dos animais
        Gato gato = new Gato("Lilico", "Felino", "Casa(doméstico)", 4, 0.4, 5.0, 4);
        Peixe peixe = new Peixe("Nemo", "Peixe Palhaço", "Oceano", 2, 0.2, 0.1);
        Pombo pombo = new Pombo("Ivete", "Pombo", "Cidade", 3, 0.3, 0.4, 2, 0.5);
        Cachorro cachorro = new Cachorro("Coronel", "Canino", "Casa(doméstico)", 7, 0.5, 20.0, 4);
        Elefante elefante = new Elefante("Dumbo", "Elefante", "Selva", 10, 3.0, 5000.0, 4);
        Leao leao = new Leao("Simba", "Felino", "Savannah", 8, 1.2, 190.0, 4);

        // Exibindo as informações com o méteodo toString()
        System.out.println(gato);
        System.out.println(peixe);
        System.out.println(pombo);
        System.out.println(cachorro);
        System.out.println(elefante);
        System.out.println(leao);
    }
}
