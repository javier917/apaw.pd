package state.connection;

public class StatePreparado implements State {

    @Override
    public void abrir(Conexion conexion) {

    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(Estado.CERRADO);
        conexion.setState(new StateCerrado());

    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(Estado.PARADO);
        conexion.setState(new StateParado());
    }

    @Override
    public void iniciar(Conexion conexion) {

    }

    @Override
    public void enviar(Conexion conexion,String msg) {
        conexion.getLink().enviar(msg);
        conexion.setState(new StateEsperando());
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {

    }

}
