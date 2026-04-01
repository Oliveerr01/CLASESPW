/* Realizar el juego de bonoloto
Para ello el sistema contara con 2 cadenas de numeros
    -numeros del sistema
    -numeros del usuario
De primeras, el sistema guardara 5 numeros aleatorios entre 1-20
El sistema pedirá al usuario que introduzca sus numeros

El sisteam deberá decidir si he ganado un premio. Para ellos los premios se reparten de la siguiente manera
    -5 aciertos --> 1 millon de euros.
    -4 aciertos --> 10mil
    -3 aciertos --> Mil
    -1-2 aciertos --> 10
    -0 --> prueba suerte la siguiente vez

    numeros sistema: 0,12,3,5,11
    numeros usuario: 12,9,6,19,3
 */

import java.util.Scanner;

public class Bonoloto {
    private int [] numerosSistema = new int[5];
    private int [] numerosUsuario = new int[5];
    private Scanner scanner = new Scanner(System.in);

    public void generarNumerosSistema(){
        for (int i = 0; i <numerosSistema.length ; i++) {
            numerosSistema[i] =(int) (Math.random()*20)+1;
        }
    }

    public void pedirNumeroUsuario(){
        for (int i = 0; i <numerosUsuario.length ; i++) {
            int numero;
            do {
                System.out.println("Introduce un valor ");
                numero = scanner.nextInt();
                if (numero<1 || numero>20){
                    System.out.println("Este numero no es valido");
                }
            }while (numero<1 || numero>20);
            numerosUsuario[i] = numero;
        }
    }

    //comprobar cuantos aciertos
}
