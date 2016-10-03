package composite.expression;

public abstract class ExpressionCompuesta implements Expression {
    private Expression exp1;

    private Expression exp2;
    
    public ExpressionCompuesta(Expression exp1, Expression exp2){
        this.exp1=exp1;
        this.exp2=exp2;
    }
}
