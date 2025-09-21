/**
 * Clase abstracta que representa un vehículo genérico.
 * Aplica herencia para que otras clases extiendan de esta.
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases.
     */
    public abstract void mover();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
