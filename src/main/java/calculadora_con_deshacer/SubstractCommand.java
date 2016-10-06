package calculadora_con_deshacer;

import upm.jbb.IO;

public class SubstractCommand extends CalculatorCommand{

    public SubstractCommand(Calculator calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Substract number";
    }

    @Override
    public void execute() {
        int resta=IO.getIO().readInt();
        this.calculadora.subtract(resta);
    }

}
