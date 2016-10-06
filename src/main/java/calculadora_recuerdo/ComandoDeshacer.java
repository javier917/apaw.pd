package calculadora_recuerdo;

import calculadora.Calculator;
import upm.jbb.IO;

public class ComandoDeshacer extends Recuerdo{

    public ComandoDeshacer(Calculator calculadora, GestorMementos gestorMementos) {
        super(calculadora, gestorMementos);
    }

    @Override
    public String name() {
        return "Restaurar";
    }

    @Override
    public void execute() {
        CalculadorMementable calculadoraMementable = (CalculadorMementable) getCalculadora();
        String key = (String) IO.getIO().select(getGestorMementos().claves());
        MementoCalculadora calculadoraMemento=getGestorMementos().getMemento(key);
        calculadoraMementable.restoreMementoCalculadora(calculadoraMemento);
    }

}
