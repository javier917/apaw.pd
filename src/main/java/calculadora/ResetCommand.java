package calculadora;

public class ResetCommand extends CalculatorCommand{

    public ResetCommand(Calculator calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Reset";
    }

    @Override
    public void execute() {
        getCalculadora().reset();
    }

}
