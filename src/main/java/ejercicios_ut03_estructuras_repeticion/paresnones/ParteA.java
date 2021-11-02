package ejercicios_ut03_estructuras_repeticion.paresnones;

import java.util.Scanner;
import java.util.Random;

public class ParteA {
    // entrada manual para jugar a pares o nones

    public static void main(String[] args) {

        final int DEDOS_MAX = 10;
        final int DEDOS_MIN = 1;

        String decisionj1;
        String decisionj2;
        int dedoj1;
        int dedoj2;

        Scanner entradaTeclado = new Scanner(System.in);

        // esto sería el modulo A 
        System.out.println("Buenas Jugador 1 y Jugador 2, las reglas son simples \n"
                + "cada jugador sacará tantos dedos como quiera después de decir si el número resultante será par o impar, luego, se sumaran. \n"
                + "Quien acierte en su decisión, gana.");

        do {

            System.out.println("Jugador 1, ¿pares o impares? Escriba su respuesta como 'pares' o 'nones', por favor. ");
            decisionj1 = entradaTeclado.nextLine();
        } while (!("pares".equals(decisionj1) || "nones".equals(decisionj1)));

        do {
            System.out.println("Y, ¿cuántos dedos va a sacar?");
            dedoj1 = entradaTeclado.nextInt();
        } while (!(dedoj1 >= DEDOS_MIN && dedoj1 <= DEDOS_MAX));

        if ("pares".equals(decisionj1)) {
            decisionj2 = "nones";

        } else {
            decisionj2 = "pares";
        }

        System.out.println("Ahora, Jugador 2, como el Jugador 1 ha elegido " + decisionj1 + ", usted eligirá " + decisionj2);
        
        do {
            System.out.println("¿Cuántos dedos sacará?");
            dedoj2 = entradaTeclado.nextInt();
        } while (!(dedoj2 >= DEDOS_MIN && dedoj2 <= DEDOS_MAX));

        System.out.println(decisionj1);
        System.out.println(dedoj1);
    }

}
