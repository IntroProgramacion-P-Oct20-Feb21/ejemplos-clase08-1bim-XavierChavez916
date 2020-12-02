/*
    El siguiente programa muestra de forma infinita la frase:
    Usted está en el ciclo

    Modificar el código para que el usuario decida si quiere seguir en el ciclo
    El usuario podrá salir con las siguiente opciones:
    SI
    Si
    SI
    si
    sI
    S
    s
 */
package ejemplosrepaso;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String salir;
        while (bandera) {
            System.out.println("Usted está en el ciclo");
            
            System.out.println("Ingrese (si) o (s) si desea salir del ciclo");
            salir = entrada.nextLine();
            
            salir = salir.toLowerCase();
            
            if(salir.equals("si") || salir.equals("s")){
                bandera = false;
            }
            
        }
    }
}
