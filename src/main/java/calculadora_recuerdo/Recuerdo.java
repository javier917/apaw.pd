package calculadora_recuerdo;

import calculadora.Calculator;
import calculadora.CalculatorCommand;

public abstract class Recuerdo extends CalculatorCommand {
    private GestorMementos gestorMementos;

    public Recuerdo(Calculator calculadora, GestorMementos gestorMementos) {
        super(calculadora);
        this.gestorMementos = gestorMementos;
    }

    public GestorMementos getGestorMementos() {
        return gestorMementos;
    }

}
