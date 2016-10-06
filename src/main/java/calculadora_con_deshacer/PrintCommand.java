package calculadora_con_deshacer;

import upm.jbb.IO;

public class PrintCommand extends CalculatorCommand {

    public PrintCommand(Calculator calculadora) {
        super(calculadora);

    }

    @Override
    public String name() {
        return "Total";
    }

    @Override
    public void execute() {
      IO.getIO().println(getCalculadora().getTotal());
    }

}
