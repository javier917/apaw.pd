package composite.expression;

public class Suma extends ExpressionCompuesta {

    public Suma(Expression exp1, Expression exp2) {
       super(exp1,exp2);
    }
    @Override
    public int operar() {
       return this.exp1.operar()+this.exp2.operar();
    }
    @Override
    public String toString() {
       return ("("+this.exp1.toString()+"+"+this.exp2.toString()+")");
        
    }
}
