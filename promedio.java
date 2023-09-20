import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
        int elementos;
        int suma = 0;
        int valor;
        double promedio;

        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("¿Cuántos números quieres sumar?");
            elementos = entrada.nextInt();

            for (int i = 1; i <= elementos; i++)

            {
                System.out.println("Inserte el número [" +i+ "] :");
                valor = entrada.nextInt();

                suma = suma + valor;
            }
            promedio = suma / elementos;

            System.out.println("El promedio de los números dados es: " + promedio);

        } catch (Exception errException) {
            System.out.println("Hubo un error, ingrese solo números.");
        } finally {
            entrada.close();
        }
    }
}
