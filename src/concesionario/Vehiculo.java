package concesionario;

/**
 *
 * @author dmper
 */
public class Vehiculo {

    private int id;
    private String tipoVehiculo;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private static int contadorVehiculos = 0;

    /**
     * Creamos un constructor vacio que servirá para cada vez que se cree un
     * nuevo vehiculo tenga un id nuevo
     */
    public Vehiculo() {
        this.id = ++Vehiculo.contadorVehiculos;
    }

    /**
     * Creamos un constructor con todos los atributos de nuestra clase
     *
     * @param tipoVehiculo Recibirá el tipo de vehiculo (Coche, Moto, Camion
     * etc)
     * @param marca Recibirá la marca de dicho vehiculo (Seat, Audi etc)
     * @param modelo Recibirá el modelo de dicho vehiculo (Seat leon, audi a3
     * etc)
     * @param color Recibirá el color de dicho vehiculo (Verde, rojo, morado)
     * @param precio Recibirá el precio que costará dicho vehiculo
     */
    public Vehiculo(String tipoVehiculo, String marca, String modelo, String color, double precio) {
        this(); // Inicializamos constructor vacio
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    // Creamos Getters y setters de cada atributo
    public String getTipoVehiculo() {
        return this.tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }

    @Override
    public String toString() {
        return "{" + "id= " + id + ", tipoVehiculo= " + tipoVehiculo + ", marca= " + marca + ", modelo= " + modelo + ", color =" + color + ", precio= " + precio + '}';
    }
}
