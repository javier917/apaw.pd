package calculadora_con_deshacer;

public abstract class CalculatorCommand implements Comando {
    protected Calculator calculadora;

    public CalculatorCommand(Calculator calculadora) {
        this.calculadora = calculadora;
    }
}
