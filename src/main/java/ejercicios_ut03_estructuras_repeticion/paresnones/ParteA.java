package ejercicios_ut03_estructuras_repeticion.paresnones;

import java.util.Scanner;
import java.util.Random;

public class ParteA {
    // entrada manual para jugar a pares o nones

    public static void main(String[] args) {

        final int DEDOS_MAX;
        final int DEDOS_MIN;

        String decisionj1;
        String decisionj2;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Buenas Jugador 1 y Jugador 2, las reglas son simples \n"
                + "cada jugador sacará tantos dedos como quiera después de decir si el número resultante será par o impar, luego, se sumaran. \n"
                + "Quien acierte en su decisión, gana.");

        do {

            System.out.println("Jugador 1, ¿pares o impares? Escriba su respuesta como 'pares' o 'nones' ");
            decisionj1 = entradaTeclado.nextLine();
        } while ("pares".equals(decisionj1)|| "nones".equals(decisionj1));

        System.out.println("Y, ¿cuántos dedos va a sacar?");
        int dedoj1 = entradaTeclado.nextInt();

        System.out.println(decisionj1);
        System.out.println(dedoj1);
    }

}
