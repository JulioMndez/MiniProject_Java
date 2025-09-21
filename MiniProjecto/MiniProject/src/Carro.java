/**
 * Clase que representa un carro.
 * Extiende de Vehiculo e implementa Combustible.
 */
public class Carro extends Vehiculo implements Combustible {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El carro " + marca + " " + modelo + " está conduciendo en la carretera.");
    }

    @Override
    public void recargar() {
        System.out.println("El carro " + marca + " está recargando combustible en la gasolinera.");
    }
}
