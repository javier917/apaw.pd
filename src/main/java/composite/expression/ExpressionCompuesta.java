package composite.expression;

public abstract class ExpressionCompuesta implements Expresion {
    protected Expresion exp1;

    protected Expresion exp2;

    public ExpressionCompuesta(Expresion exp1, Expresion exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

   

}
