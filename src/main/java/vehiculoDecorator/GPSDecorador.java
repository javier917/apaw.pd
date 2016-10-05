package vehiculoDecorator;

public class GPSDecorador extends DecoradorExtras {
    private int precio;

    public GPSDecorador(Vehiculo vehiculo) {
        super(vehiculo);
        precio = 500;
    }

    @Override
    public int precioFinal() {
        return this.vehiculo.precioFinal() + precio;
    }

    @Override
    public String descripcionFinal() {
        return this.vehiculo.descripcionFinal() + " con GPS";
    }

}
