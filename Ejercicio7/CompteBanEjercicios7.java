package Ejercicio7;

import Ejercicio3.CompteBan;

public class CompteBanEjercicios7 {
    public static void main(String[] args) {
        // Crear un objeto de la clase CompteBancari
        CompteBan cuenta = new CompteBan("123456789", 1000); // Suponiendo un saldo inicial de 1000 euros

        // Depositar 500 euros
        cuenta.depositar(500);

        // Retirar 467 euros
        cuenta.retirar(467);

        // Mostrar el saldo actual
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}
