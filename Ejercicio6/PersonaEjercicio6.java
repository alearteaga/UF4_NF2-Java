package Ejercicio6;

import Ejercicio2.Persona;

public class PersonaEjercicio6 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30, "Masculino");

        // Mostrar la información de la persona
        System.out.println("Nombre: " + persona.obtenerNombre());
        System.out.println("Edad: " + persona.obtenerEdad());
        System.out.println("Género: " + persona.obtenerGenero());

        // Cambiar el nombre de la persona
        persona.asignarNombre("María");

        // Mostrar el nuevo nombre de la persona
        System.out.println("Nuevo nombre: " + persona.obtenerNombre());
    }
}
