package calculadora_con_deshacer;

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
       this.calculadora.add(1);  
    }

}
