package Ejercicio4;

public class Coche {
    public static void main(String[] args) {
        // Crear una instancia de Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 50000);

        // Mostrar los atributos originales
        System.out.println("Marca: " + miCoche.obtenerMarca());
        System.out.println("Modelo: " + miCoche.obtenerModelo());
        System.out.println("Kilometraje: " + miCoche.obtenerKilometraje());

        // Establecer un nuevo valor para el kilometraje
        miCoche.establecerKilometraje(60000);

        // Mostrar el kilometraje actualizado
        System.out.println("Kilometraje actualizado: " + miCoche.obtenerKilometraje());
    }

    // Atributos
    private String marca;
    private String modelo;
    private double kilometraje;

    // Constructor
    public Coche(String marca, String modelo, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Métodos para obtener y establecer la marca
    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public String obtenerMarca() {
        return marca;
    }

    // Métodos para obtener y establecer el modelo
    public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    public String obtenerModelo() {
        return modelo;
    }

    // Métodos para obtener y establecer el kilometraje
    public void establecerKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double obtenerKilometraje() {
        return kilometraje;
    }
}
