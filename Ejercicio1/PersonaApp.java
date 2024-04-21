class Persona {
    // Atributos
    String nombre;
    byte edat;
    double estatura;

    // Constructor
    Persona(String nombre, byte edat, double estatura) {
        this.nombre = nombre;
        this.edat = edat;
        this.estatura = estatura;
    }

    void saludar() {
        System.out.println("Hola. Mi nombre es " + nombre);
    }

    public void cumplirAnyos() {
        edat++;
        System.out.println("Hola. Tengo " + edat + " años.");
    }

    public void crecer(double incremento) {
        estatura += incremento;
        System.out.println("Hola. Mido " + estatura + " cm.");
    }
}

public class PersonaApp {
    public static void main(String[] args) {
        // Crear instancias de Persona
        Persona juan = new Persona("Jordi", (byte) 15, 160.6);
        Persona isabel = new Persona("Isabel", (byte) 20, 165.2);

        // Llamar a los métodos de las personas
        isabel.saludar();
        juan.cumplirAnyos();
        isabel.crecer(5.0);
        isabel.cumplirAnyos();

        // Corrección de error en la inicialización de la edad de Isabel
        isabel.edat = 0;
    }
}

// El constructor está escrito como persona, pero debería ser Persona.
// En el constructor, falta el parámetro double para statura y falta el cierre
// del constructor.
// En el método saludar, falta el cierre de la llave { y el paréntesis de cierre
// ) en el println.
// En el método cumpliranyos, falta el cierre del paréntesis en el println.
// En el método crecer, falta el cierre del paréntesis en el println.
// En la clase PersonaApp, hay un error al intentar crear una instancia de
// Persona con los parámetros incorrectos. Además, falta el parámetro double
// para estatura.
// En la creación de isabel, falta usar el constructor con los parámetros
// adecuados.
// Se intenta llamar a métodos en isabel antes de crearla.
// Hay un punto (.) después de isabel.edat=0, lo que genera un error de
// sintaxis.