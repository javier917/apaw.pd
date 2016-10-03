package state.connection;

public class StateCerrado implements State {

    @Override
    public void abrir(Conexion conexion) {
        conexion.setEstado(Estado.PREPARADO);
        conexion.setState(new StatePreparado());
    }

    @Override
    public void cerrar(Conexion conexion) {

    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(Conexion conexion) {

    }

    @Override
    public void recibir(Conexion conexion) {

    }

}
