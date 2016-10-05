package vehiculoDecorator;

public class MP3Decorador extends DecoradorExtras {
    private static int PRECIO=50;

    public MP3Decorador(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public int precioFinal() {
        return this.vehiculo.precioFinal() + PRECIO;
    }

    @Override
    public String descripcionFinal() {
        return this.vehiculo.descripcionFinal() + " con MP3";
    }
}
