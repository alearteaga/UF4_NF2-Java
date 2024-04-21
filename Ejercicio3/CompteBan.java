
package Ejercicio3;

public class CompteBan {
    // Atributos
    private String numeroDeCuenta;
    private double saldo;

    // Constructor
    public CompteBan(String numeroDeCuenta, double saldoInicial) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    // Método para obtener el saldo
    public double obtenerSaldo() {
        return saldo;
    }

    // Método principal (para demostración)
    public static void main(String[] args) {
        // Crear una instancia de CuentaBancaria
        CompteBan cuenta = new CompteBan("123456789", 1000);

        // Mostrar el saldo inicial
        System.out.println("Saldo inicial: " + cuenta.obtenerSaldo());

        // Realizar algunas transacciones
        cuenta.depositar(500);
        cuenta.retirar(200);

        // Mostrar el saldo después de las transacciones
        System.out.println("Saldo final: " + cuenta.obtenerSaldo());
    }
}