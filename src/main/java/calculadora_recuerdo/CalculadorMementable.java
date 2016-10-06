package calculadora_recuerdo;

public interface CalculadorMementable {
    public MementoCalculadora CreateMementoCalculadora();
    public void restoreMementoCalculadora(MementoCalculadora mementoCalculadora);
}
