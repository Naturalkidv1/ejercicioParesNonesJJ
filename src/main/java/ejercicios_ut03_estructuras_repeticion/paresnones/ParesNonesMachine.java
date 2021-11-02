package ejercicios_ut03_estructuras_repeticion.paresnones;

import java.util.Scanner;
import java.util.Random;

public class ParesNonesMachine {
    // entrada manual para jugar a pares o nones

    public static void main(String[] args) {

        final int DEDOS_MAX = 10;
        final int DEDOS_MIN = 1;

        String decisionJ1;
        String decisionJ2;
        String paridadTotal;
        int dedoJ1;
        int dedoJ2;
        int dedoTotal;
        int paridadDedos;
        
        Scanner entradaTeclado = new Scanner(System.in);

        // esto sería el modulo A 
        System.out.println("Buenas Jugador 1 y Jugador 2, las reglas son simples \n"
                + "cada jugador sacará tantos dedos como quiera después de decir si el número resultante será par o impar, \n"
                + "luego, se sumaran. \n"
                + "Quien acierte en su decisión, gana.");

        do {

            System.out.println("Jugador 1, ¿pares o impares? Escriba su respuesta como 'pares' o 'nones', por favor. ");
            decisionJ1 = entradaTeclado.nextLine();
        } while (!("pares".equals(decisionJ1) || "nones".equals(decisionJ1)));

        do {
            System.out.println("Y, ¿cuántos dedos va a sacar?\n"
                    +"Recuerde que mínimo puede sacar un dedo y máximo diez dedos.");
            dedoJ1 = entradaTeclado.nextInt();
        } while (!(dedoJ1 >= DEDOS_MIN && dedoJ1 <= DEDOS_MAX));

        if ("pares".equals(decisionJ1)) {
            decisionJ2 = "nones";

        } else {
            decisionJ2 = "pares";
        }

        System.out.println("Ahora, Jugador 2, como el Jugador 1 ha elegido " + decisionJ1 + ", usted eligirá " + decisionJ2);
        
        do {
            System.out.println("¿Cuántos dedos sacará?\n"
                    + "Recuerde que mínimo puede sacar un dedo y máximo diez dedos.");
            dedoJ2 = entradaTeclado.nextInt();
        } while (!(dedoJ2 >= DEDOS_MIN && dedoJ2 <= DEDOS_MAX));

        System.out.println("El jugador 1 ha elegido " + decisionJ1);
        System.out.println("Y ha sacado " + dedoJ1 + " dedo(s).");
        System.out.println("El jugador 2 elige " + decisionJ2);
        System.out.println("Y ha sacado " + dedoJ2 + " dedo(s).");
        
        dedoTotal = dedoJ1 + dedoJ2;
        paridadDedos = dedoTotal %2;
        
        if (paridadDedos == 0) {
            paridadTotal = "pares"; 
        } else {
            paridadTotal = "nones";
        }
        
        System.out.println("Un total de " + dedoTotal + " dedos.");
        System.out.println("Y " + dedoTotal + " dedos, es " + paridadTotal + ".");
        

        if (paridadTotal == decisionJ1) {
            System.out.println("El Jugador 1 ha ganado.");  
        } else {
            System.out.println("El Jugador 2 ha ganado.");
        }
        
        
    }

}
