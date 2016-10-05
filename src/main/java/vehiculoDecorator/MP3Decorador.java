package vehiculoDecorator;

public class MP3Decorador extends DecoradorExtras {
    private int precio;

    public MP3Decorador(Vehiculo vehiculo) {
        super(vehiculo);
        precio = 50;
    }

    @Override
    public int precioFinal() {
        return this.vehiculo.precioFinal() + precio;
    }

    @Override
    public String descripcionFinal() {
        return this.vehiculo.descripcionFinal() + " con MP3";
    }
}
