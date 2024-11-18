package Ejemplos.EjemploCorrecto1;

// Clase derivada
public class Gerente extends Empleado {
    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}