package calculadora_con_deshacer;

import upm.jbb.IO;

public class AddCommand extends CalculatorCommand{

    public AddCommand(Calculator calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Add";
    }

    @Override
    public void execute() {
       int suma=IO.getIO().readInt();
       this.calculadora.add(suma);  
    }

}
