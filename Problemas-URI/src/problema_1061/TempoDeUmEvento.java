package problema_1061;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TempoDeUmEvento {
    public static void main(String[] args) {
        int diaInicial, diaTermino, hora, minutos, segundos;
        Calendar c = new GregorianCalendar();
        Scanner input = new Scanner(System.in);

        System.out.printf("Entre com o dia de inicio do evento: ");
        diaInicial = input.nextInt();

        System.out.printf("Entre com o dia de termino do evento: ");
        diaTermino = input.nextInt();

        System.out.printf("Entre com a hora de inicio do evento: ");
        hora = input.nextInt();

        System.out.printf("Entre com os minutos de inicio do evento: ");
        minutos = input.nextInt();

        System.out.printf("Entre com os segundos de inicio do evento: ");
        segundos = input.nextInt();

        c.set(Calendar.HOUR_OF_DAY, hora);
        c.set(Calendar.MINUTE, minutos);
        c.set(Calendar.SECOND, segundos);
        DateFormat formatador = new SimpleDateFormat("HH:mm:ss");

        System.out.println("Dia de inicio: " + diaInicial + "\nDia termino: " + diaTermino);
        System.out.println(formatador.format(c.getTime()));
    }
}
