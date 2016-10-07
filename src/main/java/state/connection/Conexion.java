package state.connection;

public class Conexion {
    private Estado estado;

    private State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
        this.state = new StateCerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void abrir() {
        this.state.abrir(this);
    }

    public void cerrar() {
        this.state.cerrar(this);
    }

    public void parar() {
        this.state.parar(this);
    }

    public void iniciar() {
        this.state.iniciar(this);
    }

    public void enviar(String msg) {
       this.state.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.ESPERANDO) {
            if (respuesta == 0) {
                this.estado = Estado.PREPARADO;
            } else {
                this.estado = Estado.CERRADO;
            }
        }
        assert false : "estado imposible";
    }

}
