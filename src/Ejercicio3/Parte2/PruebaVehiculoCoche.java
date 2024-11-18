package Ejercicio3.Parte2;

public class PruebaVehiculoCoche {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        coche.encender();   //forma correcta, llama el metodo original en vehiculo

        //coche.encenderse(); //esto da error, porque "encenderse" no existe en la clase vehiculo
    }
}
