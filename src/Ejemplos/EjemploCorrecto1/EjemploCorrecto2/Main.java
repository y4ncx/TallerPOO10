package Ejemplos.EjemploCorrecto1.EjemploCorrecto2;

import Ejemplos.EjemploCorrecto1.Empleado;
import Ejemplos.EjemploCorrecto1.Gerente;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente(); // Polimorfismo
        empleado.trabajar(); // Muestra: El empleado está trabajando.
        gerente.trabajar(); // Muestra: El gerente está gestionando el equipo.
    }
}