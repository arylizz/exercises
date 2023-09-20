import java.util.Scanner;

/**
 * Esta clase nos ayuda a calcular el área de un círculo.
 * 
 * @author Lizbeth Monserrat Miramontes Flores
 */

public class areacirculo {
    public static void main(String[] args) {
        double radio;
        double area;

        System.out.println("¡Hola, vamos a calcular el área de un círculo!");
        Scanner entrada = new Scanner(System.in);
        try {

            System.out.println("Ingrese el tamaño del radio:");
            radio = entrada.nextDouble();

            area = Math.PI * Math.pow(radio, 2);

            System.out.println("El área del círculo es:" + area);
        } catch (Exception errException) {
            System.out.println("Hubo un error, introduzca solo números");
        } finally {
            entrada.close();
        }
    }
}


