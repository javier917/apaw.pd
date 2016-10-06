package calculadora_recuerdo;

import calculadora.Calculator;
import upm.jbb.IO;

public class ComandoGuardar extends Recuerdo {

    public ComandoGuardar(Calculator calculadora, GestorMementos gestorMementos) {
        super(calculadora, gestorMementos);
    }

    @Override
    public String name() {
        return "Guardar estado";
    }

    @Override
    public void execute() {
        CalculadorMementable calculadoraMementable = (CalculadorMementable) getCalculadora();
        String key = IO.getIO().readString("Guardar como: ");
        getGestorMementos().add(key, calculadoraMementable.createMementoCalculadora());
    }

}
