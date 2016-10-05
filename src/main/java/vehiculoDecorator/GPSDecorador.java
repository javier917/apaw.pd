package vehiculoDecorator;

public class GPSDecorador extends DecoradorExtras {
    private static int PRECIO=500;

    public GPSDecorador(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public int precioFinal() {
        return this.vehiculo.precioFinal() + PRECIO;
    }

    @Override
    public String descripcionFinal() {
        return this.vehiculo.descripcionFinal() + " con GPS";
    }

}
