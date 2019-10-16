package problema_1049;

public enum AnimalNomes {
    AGUIA("Aguia"),
    POMBA("Pomba"),
    HOMEM("Homem"),
    VACA("Vaca"),
    PULGA("Pulga"),
    LAGARTA("Lagarta"),
    SANGUESSUGA("Sanguessuga"),
    MINHOCA("Minhoca");

    AnimalNomes(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    private String nomeDoAnimal;

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }
}
