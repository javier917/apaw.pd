package vehiculoDecorator;

public abstract class DecoradorExtras extends Vehiculo {
    protected Vehiculo vehiculo;

    public DecoradorExtras(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public abstract int precioFinal();

    @Override
    public abstract String descripcionFinal();

}
