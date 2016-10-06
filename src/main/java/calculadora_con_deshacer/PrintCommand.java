package calculadora_con_deshacer;

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
       System.out.println(getCalculadora().getTotal());
    }

}
