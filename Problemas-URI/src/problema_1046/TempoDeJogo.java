package problema_1046;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * <p>
 * Entrada
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 * <p>
 * Saída
 * Apresente a duração do jogo conforme exemplo abaixo.
 * <p>
 * 16 2 = O JOGO DUROU 10 HORA(S)
 * 0 0 = O JOGO DUROU 24 HORA(S)
 * 2 16 = O JOGO DUROU 14 HORA(S)
 */

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startTime, endTime, durationTime;

        out.printf("Digite a hora de inicio do jogo: ");
        startTime = input.nextInt();
        out.printf("Digite a hora de término do jogo: ");
        endTime = input.nextInt();

        durationTime = endTime - startTime;

        if (durationTime < 0) {
            durationTime = 24 + (endTime - startTime);
        }

        if (startTime == endTime) {
            out.printf("O JOGO DUROU 24 HORA(S)\n");
        } else out.printf("O JOGO DUROU %d HORA(S)\n", durationTime);


    }
}
