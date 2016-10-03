package state.connection;

public class StateParado implements State {

    @Override
    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void parar(Conexion conexion) {

    }

    @Override
    public void iniciar(Conexion conexion) {

    }

    @Override
    public void enviar(Conexion conexion) {

    }

    @Override
    public void recibir(Conexion conexion) {

    }

}
