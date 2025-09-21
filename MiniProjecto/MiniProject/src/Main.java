/**
 * Clase principal para probar el polimorfismo.
 */
public class Main {
    public static void main(String[] args) {
        // Crear arreglo de Vehiculo (polimorfismo)
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Toyota", "Corolla");
        vehiculos[1] = new Moto("Yamaha", "R3");
        vehiculos[2] = new Camion("Volvo", "FH16");

        // Invocar métodos polimórficamente
        for (Vehiculo v : vehiculos) {
            v.mover();

            // Si el vehículo usa combustible, llamamos recargar()
            if (v instanceof Combustible) {
                ((Combustible) v).recargar();
            }

            System.out.println("-------------------");
        }
    }
}
