package Ejemplos.EjemploSobreescribirMetodo;

// Clase derivada
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}