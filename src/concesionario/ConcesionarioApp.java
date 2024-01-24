package concesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dmper
 */
public class ConcesionarioApp {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean salir = false; // Condicion de salida bucle
        int opcion; // Pedir numero consola
        // Definimos la lista fuera del ciclo while para que no este creando y eliminando
        // ArryaList <Objecto tipo Vehiculo> nombre  
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        while (!salir) {
            mostrarMenu();
            try {
                opcion = pedirNumeroTeclado(consola);
                salir = ejecutarPrograma(opcion, consola, listaVehiculos);
            } catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
            }
        }
    }

    /**
     * Metodo que se encarga de pedir un numero por consola
     *
     * @param consola Recibe la clase Scanner
     * @return Devuelve el numero insertado por consola
     */
    private static int pedirNumeroTeclado(Scanner consola) {
        return Integer.parseInt(consola.nextLine());
    }

    /**
     * Metodo que sirve para mostrar el menu de nuestra app
     */
    private static void mostrarMenu() {
        System.out.println("""
                           *** APLICACION CONCESIONARIO ***
                           1. Agregar Vehiculo
                           2. Mostrar Vehiculo
                           3. Salir
                           """);
        System.out.print("Elige una opcion: ");
    }

    /**
     * Metodo que se encargar de ejecutar todo nuestro programa
     *
     * @param opcion Recibe la opcion insertada por el usuario
     * @return Devuelve un boolean si el usuario desea salir del programa
     * mientras tanto se ejecuta
     */
    private static boolean ejecutarPrograma(int opcion, Scanner consola, List<Vehiculo> listaVehiculos) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> {
                agregarVehiculo(consola, listaVehiculos);
                break;
            }case 2 -> {
                mostrarVehiculos(listaVehiculos);
                break;
            }case 3 -> {
                System.out.println("Fin programa");
                salir = true;
            }
        }
        return salir;
    }

    private static void agregarVehiculo(Scanner consola, List<Vehiculo> listaVehiculos) {
        // Creamos variables antes ya que si no en el catch salta error de no estar inicializadas
        String tipoVehiculo, marca, modelo, color;
        double precio = 0;
        
        System.out.println("Introduce el tipo de vehiculo - Ej: (Coche, Moto, Camion)");
        tipoVehiculo = consola.nextLine();
        System.out.println("Introduce la marca del vehiculo - Ej: (Volkswagen, Seat, Audi)");
        marca = consola.nextLine();
        System.out.println("Introduce el modelo del vehiculo - Ej: (Golf, Leon, a3)");
        modelo = consola.nextLine();
        System.out.println("Introduce el color del vehiculo - Ej: (Rojo , Azul, Gris)");
        color = consola.nextLine();
        try {
            System.out.println("Introduce el precio del vehiculo - Ej: (45000€ - 60550€)");
            precio = Double.parseDouble(consola.nextLine());
        }catch(NumberFormatException ex){
            System.out.println("Error has introducido valores incorrectos: " + ex.getMessage());
        }

        Vehiculo vehiculo = new Vehiculo(tipoVehiculo, marca, modelo, color, precio);
        listaVehiculos.add(vehiculo); // Nos sirve para agregar un nuevo objeto de tipo persona a nuestra lista
        System.out.println("Tu concesionario tiene: " + listaVehiculos.size() + " elementos");
    }
    
    private static void mostrarVehiculos(List<Vehiculo> listaVehiculos){
        System.out.println(listaVehiculos);
    }
}
