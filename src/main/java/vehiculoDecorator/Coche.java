package vehiculoDecorator;

public class Coche extends Vehiculo {
    private int precio;

    public Coche() {
        this.precio = 10000;
    }

    @Override
    public int precioFinal() {
        return this.precio;
    }

    @Override
    public String descripcionFinal() {
        return "Soy un coche";
    }

}
