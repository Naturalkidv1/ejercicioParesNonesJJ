package ejercicios_ut03_estructuras_repeticion.paresnones;

import java.util.Scanner;
import java.util.Random;

public class ParesNonesMachine {
    // entrada manual para jugar a pares o nones
    // repositorio público: https://github.com/Naturalkidv1/ejercicioParesNonesJJ.git
    public static void main(String[] args) {

        final int DEDOS_MAX = 10;
        final int DEDOS_MIN = 0;

        String decisionJ1;
        String decisionMaquina;
        String paridadTotal;
        int dedoJ1;
        int dedoMaquina;
        int dedoTotal;
        int paridadDedos;
        
        Scanner entradaTeclado = new Scanner(System.in);
        Random numAleatorio = new Random();

        // tras importar el Scanner y el Random, declarar e inicializar las 
        // constantes y declarar las variables e inicializar el método Scanner, 
        // comenzaremos
        
        
        // esto sería el modulo A 
        System.out.println("Buenas Jugador 1, las reglas son simples \n"
                + "sacará tantos dedos como quiera después de decir si el número resultante será par o impar, \n"
                + "luego, se sumaran con los de la máquina. \n"
                + "Quien acierte en su decisión, gana.");

        // empezamos, con los controles de seguridad y la inicialización de las variables 
        do {

            System.out.println("Jugador 1, ¿pares o impares? Escriba su respuesta como 'pares' o 'nones', por favor. ");
            decisionJ1 = entradaTeclado.nextLine();
        } while (!("pares".equals(decisionJ1) || "nones".equals(decisionJ1)));

        do {
            System.out.println("Y, ¿cuántos dedos va a sacar?\n"
                    +"Recuerde que puede sacar el puño vacío y máximo diez dedos.");
            dedoJ1 = entradaTeclado.nextInt();
        } while (!(dedoJ1 >= DEDOS_MIN && dedoJ1 <= DEDOS_MAX));

        if ("pares".equals(decisionJ1)) {
            decisionMaquina = "nones";

        } else {
            decisionMaquina = "pares";
        }

        System.out.println("Ahora, nuestra IA Sally, como usted, Jugador 1 ha elegido " + decisionJ1 + ", eligirá " + decisionMaquina);
        
       
       

        dedoMaquina = numAleatorio.nextInt(DEDOS_MAX - DEDOS_MIN + 1);
        

        // procederemos a la parte final donde se indicaran las elecciones de cada jugador
        // y el resultado del encuentro
        
        System.out.println("El jugador 1 ha elegido " + decisionJ1);
        System.out.println("Y ha sacado " + dedoJ1 + " dedo(s).");
        System.out.println("El jugador 2 elige " + decisionMaquina);
        System.out.println("Y ha sacado " + dedoMaquina + " dedo(s).");
        
        dedoTotal = dedoJ1 + dedoMaquina;
        paridadDedos = dedoTotal %2;
        
        if (paridadDedos == 0) {
            paridadTotal = "pares"; 
        } else {
            paridadTotal = "nones";
        }
        
        System.out.println("Un total de " + dedoTotal + " dedos.");
        System.out.println("Y " + dedoTotal + " dedos, es " + paridadTotal + ".");
        

        if (paridadTotal.equals(decisionJ1)) {
            System.out.println("El Jugador 1 ha ganado.");  
        } else {
            System.out.println("Gana Sally.");
        }
        
        
    }

}
