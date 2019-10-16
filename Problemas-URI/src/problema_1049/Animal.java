package problema_1049;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String classe;
        String tipo;
        String modelo;
        AnimalNomes animalNomes;

        /*
        System.out.printf("Digite a classe do animal: ");
        classe = input.next();
        System.out.printf("Digite o modelo do animal: ");
        modelo = input.toString();
        System.out.printf("Digite o tipo do animal: ");
        tipo = input.toString();
        */

        AnimalNomes.AGUIA.getNomeDoAnimal();


    }
}
