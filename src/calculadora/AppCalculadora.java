package calculadora;

import java.util.Scanner;

/**
 *
 * @author dmper
 */
public class AppCalculadora {

    public static void main(String[] args) {
        double operando1, operando2;
        int operacion;

        while (true) {
            // Mostramos el menu y controlamos las opciones
            operacion = mostrarMenu(); // Almacena la opcion que eliga el usuario
            try { // Controlamos que el usuario introduzca valores numericos
                if (operacion >= 1 && operacion <= 5) {
                    // Inicializamos las variables que haran las operaciones
                    operando1 = pedirNumeroTeclado("Introduce el valor del primer operando: "); // Almacena el numero del primer operando
                    operando2 = pedirNumeroTeclado("Introduce el valor del segundo operando: "); // Almacena el numero del segundo operando 

                    System.out.println(""); // Salto linea
                    realizarOperaciones(operacion, operando1, operando2);

                } else if (operacion == 6) {
                    System.out.println("Fin programa");
                    break; // Condicion de salida
                }
                System.out.println(""); // Salto linea
            } catch (NumberFormatException ex) {
                System.out.println("Introduce valores numericos");
            }
        }
    }

    /**
     * Este metodo se encarga de imprimir el menu y de guardar la opcion
     * seleccionada
     *
     * @return Devuelve la opcion seleccionada
     */
    private static int mostrarMenu() {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;
        // Controlamos que el usuario introduzca valores numericos
        try {
            System.out.println("*** APP CALCULADORA ***");
            System.out.println("""
                           1. Suma
                           2. Resta
                           3. Multiplicacion
                           4. Division
                           5. Modulo
                           6. Salir
                           """);
            System.out.print("Opcion a elegir: ");
            opcion = Integer.parseInt(consola.nextLine());

        } catch (NumberFormatException ex) {
            System.out.println("Introduce valores numericos");
        }
        return opcion;
    }

    /**
     * Este metodo se encarga de pedir los operandos
     *
     * @param mensaje Recibe un mensaje para los prints
     * @return Devuelve el numero insertado por consola
     */
    private static double pedirNumeroTeclado(String mensaje) {
        Scanner consola = new Scanner(System.in);
        System.out.print(mensaje);
        double numero = Double.parseDouble(consola.nextLine());

        return numero;
    }

    /**
     * Este metodo se encarga de realizar las operaciones mediante la opcion que
     * inserte el usuario
     *
     * @param operacion Recibe la operacion a la eleccion del usuario
     * @param operando1 Recibe el primer operando
     * @param operando2 Recibe el segundo operando
     */
    private static void realizarOperaciones(int operacion, double operando1, double operando2) {
        switch (operacion) {
            case 1 -> {
                System.out.println("Suma: " + (operando1 + operando2));
                break;
            }
            case 2 -> {
                System.out.println("Resta: " + (operando1 - operando2));
                break;
            }
            case 3 -> {
                System.out.println("Multiplicacion: " + (operando1 * operando2));
                break;
            }
            case 4 -> {
                System.out.println("Division: " + (operando1 / operando2));
                break;
            }
            case 5 -> {
                System.out.println("Modulo: " + (operando1 % operando2));
                break;
            }
            default ->
                System.out.print("Opcion erronea");
        }
    }
}
