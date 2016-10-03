package state.connection;

public abstract class State {
    protected Estado estado;
    
    public Estado getEstado(){
        return this.estado;
    }
    
    public abstract void abrir();

    public abstract void cerrar();

    public abstract void parar();

    public abstract void iniciar();

    public abstract void enviar();

    public abstract void recibir();

}
