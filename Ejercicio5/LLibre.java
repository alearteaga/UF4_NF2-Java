package Ejercicio5;

public class LLibre {
    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public LLibre(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }

    // Método principal (para demostración)
    public static void main(String[] args) {
        // Crear una instancia de Libro
        LLibre miLibro = new LLibre("El principito", "Antoine de Saint-Exupéry", 1943);

        // Mostrar la información del libro
        miLibro.mostrarInformacion();
    }
}
