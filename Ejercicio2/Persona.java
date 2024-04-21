package Ejercicio2;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;

    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos para obtener y asignar el nombre
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    // Métodos para obtener y asignar la edad
    public void asignarEdad(int edad) {
        this.edad = edad;
    }

    public int obtenerEdad() {
        return edad;
    }

    // Métodos para obtener y asignar el género
    public void asignarGenero(String genero) {
        this.genero = genero;
    }

    public String obtenerGenero() {
        return genero;
    }

    // Método principal (para demostración)
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona1 = new Persona("Alex", 40, "Masculino");

        // Mostrar los atributos originales
        System.out.println("Nombre: " + persona1.obtenerNombre());
        System.out.println("Edad: " + persona1.obtenerEdad());
        System.out.println("Género: " + persona1.obtenerGenero());

        // Actualizar el nombre y la edad
        persona1.asignarNombre("Nuria");
        persona1.asignarEdad(22);

        // Mostrar los atributos actualizados
        System.out.println("Nombre actualizado: " + persona1.obtenerNombre());
        System.out.println("Edad actualizada: " + persona1.obtenerEdad());
    }
}
