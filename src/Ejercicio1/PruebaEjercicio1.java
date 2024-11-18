package Ejercicio1;

public class PruebaEjercicio1 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); // acá usamos el polimorfismo
        Persona profesor = new Profesor(); // acá tambien se usa


        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}
