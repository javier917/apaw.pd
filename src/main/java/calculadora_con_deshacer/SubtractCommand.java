package calculadora_con_deshacer;

import upm.jbb.IO;

public class SubtractCommand extends CalculatorCommand{

    public SubtractCommand(Calculator calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Substract number";
    }

    @Override
    public void execute() {
        int resta=IO.getIO().readInt();
        getCalculadora().subtract(resta);
    }

}
