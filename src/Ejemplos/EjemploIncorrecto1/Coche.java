package Ejemplos.EjemploIncorrecto1;

// Clase derivada (incorrecta)
public class Coche extends Vehiculo {
    // Error de compilación: Diferente firma del método
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}