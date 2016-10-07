package state.connection;

public class StateEsperando implements State {

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
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        if (respuesta == 0) {
            conexion.setEstado(Estado.PREPARADO);
        } else {
            conexion.setEstado(Estado.CERRADO);
        }
    }

}
