package composite.expression;

public class Multiplicacion extends ExpressionCompuesta {
    public Multiplicacion(Expresion exp1, Expresion exp2) {
        super(exp1, exp2);
    }

    @Override
    public int operar() {
        return this.exp1.operar() * this.exp2.operar();
    }

    @Override
    public String toString() {
        return ("(" + this.exp1.toString() + "*" + this.exp2.toString() + ")");

    }
}
