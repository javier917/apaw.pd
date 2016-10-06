package calculadora;

public abstract class CalculatorCommand implements Comando {
    private Calculator calculadora;

    public CalculatorCommand(Calculator calculadora) {
        this.calculadora = calculadora;
    }

    public Calculator getCalculadora() {
        return calculadora;
    }
}
