/**
 * Clase que representa un camión.
 * Extiende de Vehiculo e implementa Combustible.
 */
public class Camion extends Vehiculo implements Combustible {

    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El camión " + marca + " " + modelo + " está transportando carga.");
    }

    @Override
    public void recargar() {
        System.out.println("El camión " + marca + " está repostando diésel en la estación.");
    }
}
