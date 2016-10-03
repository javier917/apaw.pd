package composite.expression;

public abstract class ExpressionCompuesta implements Expression {
    protected Expression exp1;

    protected Expression exp2;

    public ExpressionCompuesta(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

   

}
