package composite.expression;

public class Suma extends ExpressionCompuesta {

    public Suma(Expresion exp1, Expresion exp2) {
        super(exp1, exp2);
    }

    @Override
    public int operar() {
        return this.exp1.operar() + this.exp2.operar();
    }

    @Override
    public String operador() {
        return "+";
    }

}
