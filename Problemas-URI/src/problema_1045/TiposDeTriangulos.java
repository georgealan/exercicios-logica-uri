package problema_1045;

import java.util.Scanner;
import java.lang.Math;

import static java.lang.System.out;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C;

        out.println("Digite o valor de A: ");
        A = input.nextDouble();
        out.println("Digite o valor de B: ");
        B = input.nextDouble();
        out.println("Digite o valor de C: ");
        C = input.nextDouble();

        double tempA = Math.max(A, Math.max(B, C));
        double tempB = 0;
        double tempC = 0;

        if (tempA == A) {
            tempB = Math.max(B, C);
            tempC = Math.min(B, C);
        }
        if (tempA == B) {
            tempB = Math.max(A, C);
            tempC = Math.min(A, C);
        }
        if (tempA == C) {
            tempB = Math.max(B, A);
            tempC = Math.min(B, A);
        }

        //Calculos de potencia:
        double potA = Math.pow(tempA, 2);
        double potB = Math.pow(tempB, 2);
        double potC = Math.pow(tempC, 2);

        //out.println("O valor de A é: " + tempA + "\nO valor de B é: " + tempB + "\nO valor de C é: " + tempC);

        if (tempA >= (tempB + tempC)){
            out.println("NAO FORMA TRIANGULO");
        }
        if (potA == (potB + potC)){
            out.println("TRIANGULO RETANGULO");
        }
        if (potA > (potB + potC)){
            out.println("TRIANGULO OBTUSANGULO");
        }
        if (potA < (potB + potC)){
            out.println("TRIANGULO ACUTANGULO");
        }
        if ((tempA == tempB) && (tempA == tempC)){
            out.println("TRIANGULO EQUILATERO");
        }
        if ((tempA == tempB) && (tempA != tempC) || (tempA == tempC) && (tempA != tempB) || (tempB == tempC) && (tempB != tempA)){
            out.println("TRIANGULO ISOSCELES");
        }
    }
}
