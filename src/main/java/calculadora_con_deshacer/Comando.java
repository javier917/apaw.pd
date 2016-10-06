package calculadora_con_deshacer;

public interface Comando {
    public abstract String name();

    public abstract void execute();
}
