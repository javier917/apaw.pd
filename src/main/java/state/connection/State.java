package state.connection;

public interface State {
    
    
    public void abrir(Conexion conexion);

    public void cerrar(Conexion conexion);

    public void parar(Conexion conexion);

    public void iniciar(Conexion conexion);

    public void enviar(Conexion conexion, String msg);

    public void recibir(Conexion conexion, int respuesta);

}
