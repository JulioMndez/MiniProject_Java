/**
 * Clase que representa una moto.
 * Extiende de Vehiculo, pero no implementa Combustible (para mostrar polimorfismo).
 */
public class Moto extends Vehiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("La moto " + marca + " " + modelo + " está acelerando en la calle.");
    }
}
