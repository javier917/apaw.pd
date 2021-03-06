package calculadora_recuerdo;

import calculadora.Calculator;

public class CalculadorMementable extends Calculator {
    public MementoCalculadora createMementoCalculadora() {
        MementoCalculadora mementoCalculadora = new MementoCalculadora(getTotal());
        return mementoCalculadora;
    }

    public void restoreMementoCalculadora(MementoCalculadora mementoCalculadora) {
        setTotal(mementoCalculadora.getTotal());
    }
}
